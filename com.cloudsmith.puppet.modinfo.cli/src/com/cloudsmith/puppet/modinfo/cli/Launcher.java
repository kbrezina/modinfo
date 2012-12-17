package com.cloudsmith.puppet.modinfo.cli;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.yamlbeans.YamlReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.varia.NullAppender;
import org.eclipse.core.runtime.adaptor.EclipseStarter;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.jrubyparser.ast.FCallNode;
import org.jrubyparser.ast.IArgumentNode;
import org.jrubyparser.ast.ListNode;
import org.jrubyparser.ast.NilNode;
import org.jrubyparser.ast.Node;
import org.jrubyparser.ast.NodeType;
import org.jrubyparser.ast.RootNode;
import org.jrubyparser.ast.StrNode;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import com.cloudsmith.puppet.modinfo.ModuleAnalyzer;

public class Launcher implements IApplication {

	private static final String YAML_NODES_URI = "https://33.33.33.10/nodes";

	private static final String CLASS_FILTER_ALL = "all";

	private static final String CLASS_FILTER_USED = "used";

	// need to setup log4j to get rid of warnings
	static {
		System.setProperty("log4j.defaultInitOverride", "true");
		org.apache.log4j.LogManager.resetConfiguration();
		org.apache.log4j.LogManager.getRootLogger().addAppender(new NullAppender());
	}

	private static String getModuleDigest(String modulePath) throws IOException {

		String name = null;
		String version = null;

		RootNode root = RubyParserUtils.parseFile(new File(modulePath, "Modulefile"));
		for(Node node : RubyParserUtils.findNodes(root.getBody(), new NodeType[] { NodeType.FCALLNODE })) {
			FCallNode call = (FCallNode) node;
			String key = call.getName();
			List<String> args = getStringArguments(call);

			if("name".equals(key))
				name = args.get(0);
			else if("version".equals(key))
				version = args.get(0);

			if(name != null && version != null)
				break;
		}

		StringBuilder sb = new StringBuilder();

		if(name != null)
			sb.append(name);
		else {
			String[] segments = modulePath.split("/");
			sb.append(segments[segments.length - 1]);
		}

		if(version != null) {
			sb.append("(");
			sb.append(version);
			sb.append(")");
		}

		return sb.toString();
	}

	private static List<String> getStringArguments(IArgumentNode callNode) throws IllegalArgumentException {
		Node argsNode = callNode.getArgs();
		if(!(argsNode instanceof ListNode))
			throw new IllegalArgumentException("IArgumentNode expected");
		ListNode args = (ListNode) argsNode;
		int top = args.size();
		ArrayList<String> stringArgs = new ArrayList<String>(top);
		for(int idx = 0; idx < top; ++idx) {
			Node argNode = args.get(idx);
			if(argNode instanceof StrNode)
				stringArgs.add(((StrNode) argNode).getValue());
			else if(argNode instanceof NilNode)
				stringArgs.add(null);
			else
				throw new IllegalArgumentException("Can't make a string from a " + argNode.getNodeType());
		}
		return stringArgs;
	}

	private static void printUsage(CmdLineParser optionParser) {
		System.out.print("Usage: modinfo");
		optionParser.printSingleLineUsage(System.out);
		System.out.println();
		System.out.println();
		optionParser.printUsage(System.out);
		System.out.println();
	}

	@Option(name = "--location", required = false, usage = "Modulepath location; by default the location is read from PE configuration", metaVar = "<folder>[:<folder>]*")
	private String location;

	@Option(name = "--classes", required = false, usage = "Class filter; by default the parameter is set to 'used'", metaVar = "all|used")
	private String classFilter;

	@Option(name = "--help", required = false, usage = "Show this help")
	private boolean helpRequested;

	@Option(name = "--verbose", required = false, usage = "Show operation steps")
	private boolean showProgress;

	private String getPEModulePath() throws ExitException {

		String location = null;

		try {
			if(showProgress)
				System.out.println("- getting modulepath...");

			Process p = Runtime.getRuntime().exec("puppet --configprint modulepath");
			p.waitFor();

			if(p.exitValue() != 0) {
				System.out.print("Cannot get modulepath. Running 'puppet --configprint modulepath' failed.");
				System.out.println();

				throw new ExitException();
			}

			BufferedReader reader = null;

			try {
				reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
				location = reader.readLine();
			}
			finally {
				if(reader != null)
					reader.close();
			}

			if(location == null || location.contains("puppet help")) {
				System.out.print("Cannot get modulepath. Running 'puppet --configprint modulepath' returned no location.");
				System.out.println();

				throw new ExitException();
			}
		}
		catch(ExitException e) {
			throw e;
		}
		catch(Exception e) {
			System.out.println("Cannot get modulepath. Running 'puppet --configprint modulepath' failed. Error messsage: " +
					e.getMessage());
			throw new ExitException();
		}

		return location;
	}

	@SuppressWarnings("unchecked")
	private Set<String> getUsedClassesFromConsole() throws ExitException {

		Set<String> usedClasses = new HashSet<String>();

		try {
			if(showProgress)
				System.out.println("- collecting classes that are used...");

			// TODO find a better way to find app root
			String appRootFolder = null;
			String osgiInstanceArea = EclipseStarter.getSystemBundleContext().getProperty("osgi.instance.area");
			if(osgiInstanceArea != null)
				appRootFolder = osgiInstanceArea.replaceAll("^file:", "");
			if(appRootFolder == null)
				appRootFolder = EclipseStarter.getSystemBundleContext().getProperty("osgi.syspath").replaceAll(
					"plugins$", "");

			File credFile = new File(appRootFolder, "modinfo.cred");

			if(!credFile.exists()) {
				System.out.println("Cannot find '" + credFile.getAbsolutePath() +
						"'.\nPlease, create a file with a single line formatted as '<PE console user>:<PE console password>'");
				throw new ExitException();
			}

			String credentials = null;
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(credFile)));
				credentials = reader.readLine();
			}
			finally {
				if(reader != null)
					reader.close();
			}

			String[] cred = null;
			if(credentials == null || (cred = credentials.split(":")).length != 2) {
				System.out.println("Credential file '" + credFile.getAbsolutePath() +
						"' syntax error. The first line has to contain: <PE console user>:<PE console password>");
				throw new ExitException();
			}

			final HttpClient httpClient = WebClientDevWrapper.wrapClient(new DefaultHttpClient());
			Credentials defaultcreds = new UsernamePasswordCredentials(cred[0], cred[1]);

			final HttpRequestBase httpMethod = new HttpGet(new URI(YAML_NODES_URI));
			httpMethod.addHeader(new BasicScheme().authenticate(defaultcreds, httpMethod));
			httpMethod.addHeader("Accept", "text/yaml");

			HttpResponse response = httpClient.execute(httpMethod);
			int statusCode = response.getStatusLine().getStatusCode();

			if(statusCode != 200) {
				System.out.print("Cannot get list of classes that are used for nodes. Request to '" + YAML_NODES_URI +
						"' returned status code " + statusCode + ".");
				System.out.println();

				throw new ExitException();
			}

			HttpEntity contentEntity = response.getEntity();

			if(contentEntity != null) {

				YamlReader yamlReader = null;
				try {
					yamlReader = new YamlReader(new BufferedReader(new InputStreamReader(
						contentEntity.getContent(), EntityUtils.getContentCharSet(contentEntity))));
					Object object = yamlReader.read();

					if(object instanceof List) {
						for(Map<String, Object> map : (List<Map<String, Object>>) object) {
							Collection<String> classes = (Collection<String>) map.get("classes");
							if(classes != null)
								usedClasses.addAll(classes);
						}
					}
					else {
						System.out.print("Cannot get list of classes that are used for nodes. Request to '" +
								YAML_NODES_URI + "' returned unrecognized response.");
						System.out.println();

						throw new ExitException();
					}
				}
				finally {
					if(yamlReader != null)
						yamlReader.close();
				}
			}
			else {
				System.out.print("Cannot get list of classes that are used for nodes. Request to '" + YAML_NODES_URI +
						"' returned no response.");
				System.out.println();

				throw new ExitException();
			}
		}
		catch(ExitException e) {
			throw e;
		}
		catch(Exception e) {
			System.out.println("Cannot get list of classes that are used for nodes. Request to '" + YAML_NODES_URI +
					"' failed. Error messsage: " + e.getMessage());
			throw new ExitException();
		}

		return usedClasses;
	}

	private void printResults(Map<String, List<String>> classMap, Collection<String> usedClasses) throws IOException {
		for(Map.Entry<String, List<String>> moduleEntry : classMap.entrySet()) {
			System.out.println("    Module: " + getModuleDigest(moduleEntry.getKey()));

			for(String className : moduleEntry.getValue())
				if(classFilter.equals(CLASS_FILTER_ALL) || usedClasses.contains(className))
					System.out.println("        Class: " + className);
		}
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {

		String args[] = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		CmdLineParser optionParser = new CmdLineParser(this);
		try {
			optionParser.parseArgument(args);

			if(helpRequested) {
				printUsage(optionParser);
				return IApplication.EXIT_OK;
			}

			if(location == null)
				try {
					location = getPEModulePath();
				}
				catch(ExitException e) {
					return IApplication.EXIT_OK;
				}

			if(classFilter == null)
				classFilter = CLASS_FILTER_USED;

			Set<String> usedClasses = null;
			if(!classFilter.equals(CLASS_FILTER_ALL))
				try {
					usedClasses = getUsedClassesFromConsole();
				}
				catch(ExitException e) {
					return IApplication.EXIT_OK;
				}

			if(showProgress) {
				System.out.println("- analyzing existing modules...");
				System.out.println();
			}

			for(String loc : location.split(":")) {
				System.out.println("Location: " + loc);

				Map<String, List<String>> classMap = new ModuleAnalyzer().invoke(new File(loc));
				printResults(classMap, usedClasses);
			}
		}
		catch(CmdLineException e) {
			printUsage(optionParser);
		}

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
	}

}
