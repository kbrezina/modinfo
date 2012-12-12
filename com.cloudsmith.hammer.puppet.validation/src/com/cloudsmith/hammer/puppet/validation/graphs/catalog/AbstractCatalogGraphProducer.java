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

import java.util.Collections;

import org.cloudsmith.geppetto.catalog.CatalogFactory;
import org.cloudsmith.geppetto.catalog.CatalogResource;
import org.cloudsmith.geppetto.catalog.CatalogResourceParameter;
import org.cloudsmith.graph.dot.DotRenderer;
import org.cloudsmith.graph.elements.Vertex;
import org.cloudsmith.graph.style.IStyleFactory;

import com.cloudsmith.hammer.puppet.validation.graphs.IHrefProducer;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Functionality common to Catalog Graph producers.
 * 
 */
public class AbstractCatalogGraphProducer implements CatalogGraphStyles {

	/**
	 * Preferably "&#8658; ", but that does not seem to work everywhere.
	 */
	protected static final String DOUBLE_RIGHT_ARROW = "=&gt; ";

	protected final IStyleFactory styles;

	protected final CatalogGraphTheme theme;

	protected final DotRenderer dotRenderer;

	protected final Injector injector;

	protected final IHrefProducer hrefProducer;

	protected static Predicate<? super CatalogResourceParameter> regularParameterPredicate = new Predicate<CatalogResourceParameter>() {

		@Override
		public boolean apply(CatalogResourceParameter input) {
			String aName = input.getName();
			// skip the parameters that are really dependencies
			if("before".equals(aName) || "subscribe".equals(aName) || "require".equals(aName) || "notify".equals(aName))
				return false;
			return true;
		}
	};

	protected AbstractCatalogGraphProducer(Class<? extends IHrefProducer> hrefProducerClass, String prefix) {
		injector = Guice.createInjector(new CatalogGraphModule());
		styles = get(IStyleFactory.class);
		theme = get(CatalogGraphTheme.class);
		dotRenderer = get(DotRenderer.class);
		hrefProducer = get(hrefProducerClass);
		if(hrefProducer instanceof IHrefProducer.Configurable)
			((IHrefProducer.Configurable) hrefProducer).configure(prefix);
	}

	protected Vertex createVertexForMissingResource(String ref) {
		Vertex v = new Vertex("", STYLE_MissingResource);
		v.setStyles(styles.labelFormat(styles.labelStringTemplate("Error: Unknown \\n" + ref)));
		return v;
	}

	protected <T> T get(Class<T> clazz) {
		// if(injector == null)
		// injector = Guice.createInjector();
		return injector.getInstance(clazz);
	}

	/**
	 * Adds "exported" and "virtual" as pseudo parameters if they are set to true.
	 * 
	 * @param r
	 * @return
	 */
	protected Iterable<CatalogResourceParameter> getParameterIterable(CatalogResource r) {
		Iterable<CatalogResourceParameter> result = r.getParameters();
		if(r.isExported() || r.isVirtual()) {
			if(r.isExported()) {
				CatalogResourceParameter p = CatalogFactory.eINSTANCE.createCatalogResourceParameter();
				p.setName("exported");
				p.getValue().add("true");
				result = Iterables.concat(result, Collections.singleton(p));
			}
			if(r.isVirtual()) {
				CatalogResourceParameter p = CatalogFactory.eINSTANCE.createCatalogResourceParameter();
				p.setName("virtual");
				p.getValue().add("true");
				result = Iterables.concat(result, Collections.singleton(p));
			}
		}
		return result;
	}

}
