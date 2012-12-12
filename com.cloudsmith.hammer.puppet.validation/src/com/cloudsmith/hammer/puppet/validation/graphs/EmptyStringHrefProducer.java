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

import java.io.File;

import org.eclipse.core.runtime.IPath;

import com.cloudsmith.hammer.puppet.validation.runner.AllModuleReferences.Export;
import com.cloudsmith.hammer.puppet.validation.runner.MetadataInfo;

/**
 * A HREF provider that does not provide any links.
 * 
 */
public class EmptyStringHrefProducer implements IHrefProducer {

	@Override
	public String href(Export e, File root) {
		return "";
	}

	@Override
	public String href(MetadataInfo moduleInfo, File root) {
		return "";
	}

	@Override
	public String hrefForEdge(String idFrom, String idTo, boolean splitEdge) {
		return "";
	}

	@Override
	public String hrefForEdgeToPptp(String idFrom) {
		return "";
	}

	@Override
	public String hrefForEdgeToUnresolved(String idFrom, boolean splitEdge) {
		return "";
	}

	@Override
	public String hrefForUnresolved(String fromModuleName, String name) {
		return "";
	}

	@Override
	public String hrefToManifest(IPath f, IPath root, int line) {
		return "";
	}

}
