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
package com.cloudsmith.hammer.puppet.validation.graphs;

/**
 * Producer of HREF attribute suitable for github (e.g. https://github.com/owner/proj/branch/<file>#Lnn).
 * The prefix "https://github.com/<ownder>/<repo>/<branch>/" should be set as the Configurable prefix.
 * 
 */
public class GithubURLHrefProducer extends RelativeFileHrefProducer implements IHrefProducer.Configurable {
	protected String URLprefix = "";

	@Override
	public void configure(String urlPrefix) {
		this.URLprefix = urlPrefix;
	}

	/**
	 * This implementation returns and URL to the file at github at a specific line.
	 * This requires that the prefix has been set correctly.
	 * 
	 * @param path
	 * @param line
	 * @param start
	 * @param length
	 * @return
	 */
	@Override
	protected String hrefToFileLocation(String path, int line, int start, int length) {
		StringBuilder builder = new StringBuilder();
		builder.append(this.URLprefix);
		if(!URLprefix.endsWith("/"))
			builder.append("/");
		builder.append(path);
		if(line != -1) {
			builder.append("#L");
			builder.append(line);
		}
		// offset-length not supported at github
		return builder.toString();
	}

	@Override
	protected String hrefToModule(String path) {
		return hrefToFileLocation(path, -1, -1, -1);
	}

	@Override
	protected String hrefToNode(String path) {
		return hrefToFileLocation(path, -1, -1, -1);
	}
}
