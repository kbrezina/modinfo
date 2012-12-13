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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

//import org.cloudsmith.geppetto.forge.impl.MetadataImpl;

public abstract class ForgeCallable {
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

	private transient File repositoryDir;

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

	protected File getRepositoryDir() {
		return repositoryDir;
	}

	protected abstract Map<String, List<String>> invoke() throws IOException, InterruptedException;

	public final Map<String, List<String>> invoke(File f) throws IOException, InterruptedException {
		repositoryDir = f;
		return invoke();
	}
}
