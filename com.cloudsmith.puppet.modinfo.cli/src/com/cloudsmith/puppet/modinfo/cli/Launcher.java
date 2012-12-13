package com.cloudsmith.puppet.modinfo.cli;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import com.cloudsmith.puppet.modinfo.ModuleAnalyzer;

public class Launcher implements IApplication {

	@Option(name = "--location", required = true, usage = "Location", metaVar = "<folder>")
	private String location;

	private void printResults(Map<String, List<String>> classMap) {
		for(Map.Entry<String, List<String>> moduleEntry : classMap.entrySet()) {
			System.out.println("Module: " + moduleEntry.getKey());

			for(String className : moduleEntry.getValue())
				System.out.println("    Class: " + className);
		}
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String args[] = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		CmdLineParser optionParser = new CmdLineParser(this);
		try {
			optionParser.parseArgument(args);
			System.out.println("Location: " + location);
			Map<String, List<String>> classMap = new ModuleAnalyzer().invoke(new File(location));
			printResults(classMap);
		}
		catch(CmdLineException e) {
			System.out.print("Usage: modinfo");
			optionParser.printSingleLineUsage(System.out);
			System.out.println();
		}

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
	}

}
