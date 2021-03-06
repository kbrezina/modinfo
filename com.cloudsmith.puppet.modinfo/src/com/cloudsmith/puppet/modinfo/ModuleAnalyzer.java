package com.cloudsmith.puppet.modinfo;

/**
 * Copyright (c) 2012 Cloudsmith Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Cloudsmith
 * 
 */

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.cloudsmith.geppetto.common.os.StreamUtil.OpenBAStream;
import org.cloudsmith.geppetto.pp.dsl.PPStandaloneSetup;
import org.cloudsmith.geppetto.pp.dsl.target.PptpResourceUtil;
import org.cloudsmith.geppetto.pp.dsl.validation.DefaultPotentialProblemsAdvisor;
import org.cloudsmith.geppetto.puppetlint.PuppetLintRunner;
import org.cloudsmith.geppetto.puppetlint.PuppetLintRunner.Issue;
import org.cloudsmith.geppetto.puppetlint.PuppetLintService;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;

import com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData;
import com.cloudsmith.hammer.puppet.validation.FileType;
import com.cloudsmith.hammer.puppet.validation.GraphHrefType;
import com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions;
import com.cloudsmith.hammer.puppet.validation.ValidationFactory;
import com.cloudsmith.hammer.puppet.validation.ValidationOptions;
import com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode;
import com.cloudsmith.hammer.puppet.validation.graphs.SVGProducer;
import com.cloudsmith.hammer.puppet.validation.runner.AllModuleReferences;
import com.cloudsmith.hammer.puppet.validation.runner.AllModuleReferences.ClassDescription;
import com.cloudsmith.hammer.puppet.validation.runner.AllModuleReferences.Export;
import com.cloudsmith.hammer.puppet.validation.runner.BuildResult;
import com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider;
import com.google.common.collect.Multimap;

//import org.cloudsmith.geppetto.forge.impl.MetadataImpl;

public class ModuleAnalyzer {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -3048930993120683688L;

	public static final String IMPORTED_MODULES_ROOT = "importedModules";

	// Directory names that should not be checksummed or copied.
	public static final Pattern DEFAULT_EXCLUDES_PATTERN;

	// @fmtOff
	private static final String[] defaultExcludes = {
		"*~",
		"#*#",
		".#*",
		"%*%",
		"._*",
		"CVS",
		".cvsignore",
		"SCCS",
		"vssver.scc",
		".svn",
		".DS_Store",
		".git",
		".gitattributes",
		".gitignore",
		".gitmodules",
		".hg",
		".hgignore",
		".hgsub",
		".hgsubstate",
		".hgtags",
		".bzr",
		".bzrignore",
		".project",
		".settings",
		".classpath",
		".bzrignore",
		"pkg",
		"coverage"
	};
	// @fmtOn

	static {
		StringBuilder bld = new StringBuilder();
		bld.append("^(?:");
		appendExcludePattern(defaultExcludes[0], bld);
		for(int idx = 1; idx < defaultExcludes.length; ++idx) {
			bld.append('|');
			appendExcludePattern(defaultExcludes[idx], bld);
		}
		bld.append(")$");
		DEFAULT_EXCLUDES_PATTERN = Pattern.compile(bld.toString());
	}

	private static final Charset UTF_8 = Charset.forName("UTF-8");

	private static void appendExcludePattern(String string, StringBuilder bld) {
		int top = string.length();
		for(int idx = 0; idx < top; ++idx) {
			char c = string.charAt(idx);
			switch(c) {
				case '.':
					bld.append('\\');
					bld.append(c);
					break;
				case '*':
					bld.append('.');
					bld.append('*');
					break;
				case '?':
					bld.append('.');
					break;
				default:
					bld.append(c);
			}
		}
	}

	//private transient String repositoryHrefPrefix;

	private static DiagnosticType getDiagnosticType(org.eclipse.emf.common.util.Diagnostic validationDiagnostic) {
		DiagnosticType type;
		switch(validationDiagnostic.getCode()) {
			case ValidationServiceDiagnosticCode.CATALOG_PARSER_VALUE:
				type = DiagnosticType.CATALOG_PARSER;
				break;
			case ValidationServiceDiagnosticCode.CATALOG_VALUE:
				type = DiagnosticType.CATALOG;
				break;
			case ValidationServiceDiagnosticCode.FORGE_VALUE:
				type = DiagnosticType.FORGE;
				break;
			case ValidationServiceDiagnosticCode.GEPPETTO_SYNTAX_VALUE:
				type = DiagnosticType.GEPPETTO_SYNTAX;
				break;
			case ValidationServiceDiagnosticCode.GEPPETTO_VALUE:
				type = DiagnosticType.GEPPETTO;
				break;
			case ValidationServiceDiagnosticCode.INTERNAL_ERROR_VALUE:
				type = DiagnosticType.INTERNAL_ERROR;
				break;
			case ValidationServiceDiagnosticCode.PUPPET_LINT_VALUE:
				type = DiagnosticType.PUPPET_LINT;
				break;
			case ValidationServiceDiagnosticCode.RUBY_SYNTAX_VALUE:
				type = DiagnosticType.RUBY_SYNTAX;
				break;
			case ValidationServiceDiagnosticCode.RUBY_VALUE:
				type = DiagnosticType.RUBY;
				break;
			default:
				type = DiagnosticType.UNKNOWN;
		}
		return type;
	}

	private static int getSeverity(Issue issue) {
		switch(issue.getSeverity()) {
			case ERROR:
				return MessageWithSeverity.ERROR;
			default:
				return MessageWithSeverity.WARNING;
		}
	}

	private static int getSeverity(org.eclipse.emf.common.util.Diagnostic validationDiagnostic) {
		int severity;
		switch(validationDiagnostic.getSeverity()) {
			case org.eclipse.emf.common.util.Diagnostic.ERROR:
				severity = MessageWithSeverity.ERROR;
				break;
			case org.eclipse.emf.common.util.Diagnostic.WARNING:
				severity = MessageWithSeverity.WARNING;
				break;
			case org.eclipse.emf.common.util.Diagnostic.INFO:
				severity = MessageWithSeverity.INFO;
				break;
			default:
				severity = MessageWithSeverity.OK;
		}
		return severity;
	}

	private static String locationLabel(DetailedDiagnosticData detail) {
		int lineNumber = detail.getLineNumber();
		int offset = detail.getOffset();
		int length = detail.getLength();
		StringBuilder builder = new StringBuilder();
		if(lineNumber > 0)
			builder.append(lineNumber);
		else
			builder.append("-");

		if(offset >= 0) {
			builder.append("(");
			builder.append(offset);
			if(length >= 0) {
				builder.append(",");
				builder.append(length);
			}
			builder.append(")");
		}
		return builder.toString();
	}

	private static List<String> readClasses(List<String> classes, AllModuleReferences references,
			Iterable<Export> exports) {

		for(ClassDescription classDescription : references.getClassDescriptions(exports)) {
			classes.add(classDescription.getExportedClass().getName());
		}

		return classes;
	}

	private transient File repositoryDir;

	private Diagnostic convertPuppetLintDiagnostic(File moduleRoot, Issue issue) {
		Diagnostic diagnostic = new Diagnostic();
		diagnostic.setSeverity(getSeverity(issue));
		diagnostic.setMessage(issue.getMessage());
		diagnostic.setType(DiagnosticType.PUPPET_LINT);
		diagnostic.setSource(getRepositoryHrefPrefix());
		diagnostic.setResourcePath(getRelativePath(new File(moduleRoot, issue.getPath())));
		diagnostic.setLocationLabel(Integer.toString(issue.getLineNumber()));
		return diagnostic;
	}

	private Diagnostic convertValidationDiagnostic(org.eclipse.emf.common.util.Diagnostic validationDiagnostic) {

		Object dataObj = validationDiagnostic.getData().get(0);
		String resourcePath = null;
		String locationLabel = null;
		if(dataObj instanceof DetailedDiagnosticData) {
			DetailedDiagnosticData details = (DetailedDiagnosticData) dataObj;
			resourcePath = details.getFile().getPath();
			locationLabel = locationLabel(details);
		}

		Diagnostic diagnostic = new Diagnostic();
		diagnostic.setSeverity(getSeverity(validationDiagnostic));
		diagnostic.setType(getDiagnosticType(validationDiagnostic));
		diagnostic.setMessage(validationDiagnostic.getMessage());
		diagnostic.setSource(getRepositoryHrefPrefix());
		diagnostic.setResourcePath(resourcePath);
		diagnostic.setLocationLabel(locationLabel);
		return diagnostic;
	}

	private boolean findModuleFiles(File[] files, List<File> moduleFiles) {
		if(files != null) {
			int idx = files.length;
			while(--idx >= 0)
				if("Modulefile".equals(files[idx].getName()))
					return true;

			idx = files.length;
			while(--idx >= 0) {
				File file = files[idx];
				String name = file.getName();
				if(DEFAULT_EXCLUDES_PATTERN.matcher(name).matches())
					continue;

				if(findModuleFiles(file.listFiles(), moduleFiles))
					moduleFiles.add(file);
			}
		}
		return false;
	}

	protected List<File> findModuleRoots() {
		// Scan for valid directories containing "Modulefile" files.

		List<File> moduleRoots = new ArrayList<File>();
		if(findModuleFiles(repositoryDir.listFiles(), moduleRoots))
			// The repository is a module in itself
			moduleRoots.add(repositoryDir);
		return moduleRoots;
	}

	private List<ModuleInfo> geppettoValidation(List<File> moduleLocations) throws IOException {

		BasicDiagnostic diagnostics = new BasicDiagnostic();

		OpenBAStream dotStream = new OpenBAStream();

		List<File> importedModuleLocations = Collections.<File> emptyList();

		ModuleDependencyGraphOptions graphOptions = getDependencyGraphOptions(dotStream, importedModuleLocations);
		ValidationOptions options = getValidationOptions(moduleLocations, importedModuleLocations);
		options.setDependencyGraphOptions(graphOptions);

		BuildResult buildResult = ValidationFactory.eINSTANCE.createValidationService().validate(
			diagnostics, getRepositoryDir(), options,
			importedModuleLocations.toArray(new File[importedModuleLocations.size()]), new NullProgressMonitor());
		AllModuleReferences references = buildResult.getAllModuleReferences();

		List<ModuleInfo> moduleInfos = new ArrayList<ModuleInfo>();
		Map<String, ModuleInfo> moduleMap = new HashMap<String, ModuleInfo>();

		String rootPath = getRepositoryDir().getAbsolutePath() + File.separatorChar;
		int rootPathLen = rootPath.length();

		for(File moduleLocation : moduleLocations) {
			Multimap<File, Export> exportsPerModule = references.getExportsPerModule();

			List<String> classes = new ArrayList<String>();

			readClasses(classes, references, exportsPerModule.get(moduleLocation));

			Collections.sort(classes);

			String location = moduleLocation.getAbsolutePath();
			if(location.startsWith(rootPath))
				location = location.substring(rootPathLen);

			ModuleInfo moduleInfo;

			moduleInfos.add(moduleInfo = new ModuleInfo(location, classes));
			moduleMap.put(location, moduleInfo);
		}

		Collections.sort(moduleInfos, new Comparator<ModuleInfo>() {

			@Override
			public int compare(ModuleInfo m1, ModuleInfo m2) {
				return m1.getLocation().compareTo(m2.getLocation());
			}

		});

		for(org.eclipse.emf.common.util.Diagnostic diagnostic : diagnostics.getChildren()) {
			Diagnostic diag = convertValidationDiagnostic(diagnostic);
			String diagPath = diag.getResourcePath();

			for(Map.Entry<String, ModuleInfo> entry : moduleMap.entrySet())
				if(diagPath != null && diagPath.startsWith(entry.getKey())) {
					entry.getValue().addDiagnostic(diag);
					break;
				}
		}

		return moduleInfos;
	}

	private ModuleDependencyGraphOptions getDependencyGraphOptions(OutputStream dotStream, List<File> moduleLocations)
			throws IOException {
		// Assume service API
		ModuleDependencyGraphOptions graphOptions = ValidationFactory.eINSTANCE.createModuleDependencyGraphOptions();

		String hrefPrefix = getRepositoryHrefPrefix();
		if(hrefPrefix != null) {
			graphOptions.setGraphHrefPrefix(hrefPrefix);
			graphOptions.setGraphHrefType(GraphHrefType.GITHUB);
		}

		graphOptions.setDotStream(dotStream);
		graphOptions.setModulesToGraph(moduleLocations.toArray(new File[moduleLocations.size()]));

		graphOptions.setTitle("");
		return graphOptions;
	}

	//	private Metadata getModuleMetadata(File moduleDirectory) throws IOException {
	//		StringWriter writer = new StringWriter();
	//		try {
	//			Gson gson = JsonUtils.getGSon();
	//			gson.toJson(ForgeFactory.eINSTANCE.createForgeService().loadModule(moduleDirectory), writer);
	//		}
	//		finally {
	//			StreamUtil.close(writer);
	//		}
	//		Gson gson = getForge().createGson();
	//		return gson.fromJson(writer.toString(), Metadata.class);
	//	}
	//
	private String getRelativePath(File file) {
		IPath rootPath = Path.fromOSString(getRepositoryDir().getAbsolutePath());
		IPath path = Path.fromOSString(file.getAbsolutePath());
		IPath relative = path.makeRelativeTo(rootPath);
		return relative.toPortableString();
	}

	protected File getRepositoryDir() {
		return repositoryDir;
	}

	private synchronized String getRepositoryHrefPrefix() {
		return "";
	}

	//	private synchronized String getRepositoryHrefPrefix() {
	//		if(repositoryHrefPrefix == null) {
	//			String repositoryURL = getRepositoryURL();
	//			Matcher m = GITHUB_REPO_URL_PATTERN.matcher(repositoryURL);
	//			if(m.find()) {
	//				repositoryHrefPrefix = String.format(
	//					"https://github.com/%s/%s/blob/%s", m.group(1), m.group(2), getBranchName());
	//				return repositoryHrefPrefix;
	//			}
	//			repositoryHrefPrefix = "";
	//		}
	//		return repositoryHrefPrefix.length() == 0
	//				? null
	//				: repositoryHrefPrefix;
	//	}
	//
	private ValidationOptions getValidationOptions(List<File> moduleLocations, List<File> importedModuleLocations) {
		ValidationOptions options = ValidationFactory.eINSTANCE.createValidationOptions();
		options.setCheckLayout(true);
		options.setCheckModuleSemantics(true);
		options.setCheckReferences(true);
		options.setFileType(FileType.PUPPET_ROOT);

		// TODO: Selectable in the UI
		options.setPlatformURI(PptpResourceUtil.getPuppet_2_7_19());

		options.setEncodingProvider(new IEncodingProvider() {
			public String getEncoding(URI file) {
				return UTF_8.name();
			}
		});

		StringBuilder searchPath = new StringBuilder();

		searchPath.append("lib/*:environments/$environment/*");

		for(File moduleLocation : moduleLocations)
			searchPath.append(":" + getRelativePath(moduleLocation) + "/*");

		for(File importedModuleLocation : importedModuleLocations)
			searchPath.append(":" + getRelativePath(importedModuleLocation) + "/*");

		options.setSearchPath(searchPath.toString());
		options.setProblemsAdvisor(new DefaultPotentialProblemsAdvisor());
		return options;
	}

	public final List<ModuleInfo> invoke(File f) throws IOException, InterruptedException {
		repositoryDir = f;

		ResultWithDiagnostic<byte[]> resultWithDiagnostic = new ResultWithDiagnostic<byte[]>();
		List<File> moduleRoots = findModuleRoots();
		if(moduleRoots.isEmpty()) {
			resultWithDiagnostic.addChild(new Diagnostic(MessageWithSeverity.ERROR, "No modules found in repository"));
			return Collections.emptyList();
		}

		PPStandaloneSetup.doSetup();

		//		MetadataRepository metadataRepo = getForge().createMetadataRepository();
		//
		//		List<Metadata> metadatas = new ArrayList<Metadata>();
		//		for(File moduleRoot : moduleRoots) {
		//			Metadata metadata = getModuleMetadata(moduleRoot);
		//			if(metadataRepo.resolve(metadata.getName(), metadata.getVersion()) != null) {
		//				Diagnostic diag = new Diagnostic(Diagnostic.WARNING, "Module " + metadata.getName() + ':' +
		//						metadata.getVersion() + " has already been published");
		//				diag.setIssue(ForgeValidator.ALREADY_PUBLISHED);
		//				diag.setResourcePath(moduleRoot.getAbsolutePath());
		//				result.addChild(diag);
		//			}
		//			metadatas.add(metadata);
		//		}
		//
		//		Set<Dependency> unresolvedCollector = new HashSet<Dependency>();
		//		Set<Release> releasesToDownload = resolveDependencies(metadataRepo, metadatas, unresolvedCollector);
		//		for(Dependency unresolved : unresolvedCollector)
		//			result.addChild(new Diagnostic(Diagnostic.WARNING, String.format(
		//				"Unable to resolve dependency: %s:%s", unresolved.getName(),
		//				unresolved.getVersionRequirement().toString())));
		//
		//		List<File> importedModuleRoots;
		//		if(!releasesToDownload.isEmpty()) {
		//			File importedModulesDir = new File(getBuildDir(), IMPORTED_MODULES_ROOT);
		//			importedModulesDir.mkdirs();
		//			importedModuleRoots = new ArrayList<File>();
		//
		//			ReleaseService releaseService = getForge().createReleaseService();
		//			for(Release release : releasesToDownload) {
		//				result.addChild(new Diagnostic(Diagnostic.INFO, "Installing dependent module " + release.getFullName() +
		//						':' + release.getVersion()));
		//				importedModuleRoots.add(downloadAndInstall(releaseService, importedModulesDir, result, release));
		//			}
		//		}
		//		else {
		//			importedModuleRoots = Collections.emptyList();
		//			if(unresolvedCollector.isEmpty())
		//				result.addChild(new Diagnostic(Diagnostic.INFO, "No addtional dependencies were detected"));
		//		}

		//		geppettoValidation(moduleRoots, importedModuleRoots, result);
		//		lintValidation(moduleRoots, result);
		//		return result;

		List<ModuleInfo> moduleInfos = geppettoValidation(moduleRoots);

		return moduleInfos;
	}

	private void lintValidation(List<File> moduleLocations, Diagnostic result) throws IOException {
		PuppetLintRunner runner = PuppetLintService.getInstance().getPuppetLintRunner();
		for(File moduleRoot : moduleLocations) {
			for(PuppetLintRunner.Issue issue : runner.run(moduleRoot)) {
				Diagnostic diag = convertPuppetLintDiagnostic(moduleRoot, issue);
				if(diag != null)
					result.addChild(diag);
			}
		}
	}

	private byte[] produceSVG(InputStream dotStream) throws IOException {
		ByteArrayOutputStream svgStream = new ByteArrayOutputStream();
		new SVGProducer().produceSVG(dotStream, svgStream, false, new NullProgressMonitor());
		return svgStream.toByteArray();
	}

	//	private Set<Release> resolveDependencies(MetadataRepository metadataRepo, List<Metadata> metadatas,
	//			Set<Dependency> unresolvedCollector) throws IOException {
	//		// Resolve missing dependencies
	//		Set<Dependency> deps = new HashSet<Dependency>();
	//		for(Metadata metadata : metadatas)
	//			deps.addAll(metadata.getDependencies());
	//
	//		// Remove the dependencies that appoints modules that we have in the workspace
	//		Iterator<Dependency> depsItor = deps.iterator();
	//		nextDep: while(depsItor.hasNext()) {
	//			Dependency dep = depsItor.next();
	//			for(Metadata metadata : metadatas)
	//				if(dep.matches(metadata)) {
	//					depsItor.remove();
	//					continue nextDep;
	//				}
	//		}
	//
	//		// Resolve remaining dependencies
	//		Set<Release> releasesToDownload = new HashSet<Release>();
	//		for(Dependency dep : deps)
	//			releasesToDownload.addAll(metadataRepo.deepResolve(dep, unresolvedCollector));
	//		return releasesToDownload;
	//	}
}
