/**
 * Copyright (c) 2011 Cloudsmith Inc. and other contributors, as listed below.
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

import org.cloudsmith.graph.DefaultGraphModule;
import org.cloudsmith.graph.dot.DotRenderer;
import org.cloudsmith.graph.graphviz.IGraphviz;
import org.cloudsmith.graph.graphviz.SVGFixerOutputStream;
import org.cloudsmith.graph.graphviz.SVGFixerOutputStreamFilterFactory;
import org.cloudsmith.graph.utils.IOutputStreamFilterFactory;

import com.google.inject.Singleton;

/**
 * Configuration for Graph Producers that produce DOT output suitable for SVG post processing.
 * Makes use of a magic empty string that is filtered out when producing SVG.
 * Note that this configuration is (more or less) useless when using the generated DOT to provide anything but SVG
 * output as empty strings will contain the magic text which may be rendered to a non post-processable format
 * (e.g. removing text rendered into a JPEG).
 * 
 */
public class FixedSVGGraphModule extends DefaultGraphModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.cloudsmith.graph.DefaultGraphModule#bindEmptyStringConstant()
	 */
	@Override
	protected void bindEmptyStringConstant() {
		bindConstant().annotatedWith(DotRenderer.EmptyString.class).to(SVGFixerOutputStream.EMPTY_STRING_BUG);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.cloudsmith.graph.DefaultGraphModule#bindSVGOutputFilterProvider()
	 */
	@Override
	protected void bindSVGOutputFilterProvider() {
		bind(IOutputStreamFilterFactory.class).annotatedWith(IGraphviz.SVGOutputFilter.class).to(
			SVGFixerOutputStreamFilterFactory.class).in(Singleton.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.cloudsmith.graph.DefaultGraphModule#configure()
	 */
	@Override
	protected void configure() {
		super.configure();
	}
}
