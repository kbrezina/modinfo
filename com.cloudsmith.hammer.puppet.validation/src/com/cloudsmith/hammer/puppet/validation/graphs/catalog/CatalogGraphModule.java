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
package com.cloudsmith.hammer.puppet.validation.graphs.catalog;

import com.cloudsmith.hammer.puppet.validation.graphs.FixedSVGGraphModule;
import com.cloudsmith.hammer.puppet.validation.graphs.IHrefProducer;
import com.cloudsmith.hammer.puppet.validation.graphs.JavascriptHrefProducer;

/**
 * Configuration for CatalogGraph.
 * 
 */
public class CatalogGraphModule extends FixedSVGGraphModule {
	protected void bindIHrefProducer() {
		bind(IHrefProducer.class).to(JavascriptHrefProducer.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.cloudsmith.graph.DefaultGraphModule#configure()
	 */
	@Override
	protected void configure() {
		super.configure();
		bindIHrefProducer();
	}
}
