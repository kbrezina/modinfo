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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.cloudsmith.geppetto.catalog.Catalog;
import org.cloudsmith.geppetto.catalog.util.CatalogJsonSerializer;
import org.cloudsmith.graph.ICancel;
import org.cloudsmith.graph.utils.ByteArrayOutputStream2;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

import com.cloudsmith.hammer.puppet.validation.GraphHrefType;
import com.cloudsmith.hammer.puppet.validation.graphs.AbsoluteFileHrefProducer;
import com.cloudsmith.hammer.puppet.validation.graphs.EmptyStringHrefProducer;
import com.cloudsmith.hammer.puppet.validation.graphs.GithubURLHrefProducer;
import com.cloudsmith.hammer.puppet.validation.graphs.IHrefProducer;
import com.cloudsmith.hammer.puppet.validation.graphs.JavascriptHrefProducer;
import com.cloudsmith.hammer.puppet.validation.graphs.ProgressMonitorCancelIndicator;
import com.cloudsmith.hammer.puppet.validation.graphs.RelativeFileHrefProducer;

/**
 * Catalog Services provides services that:
 * <ul>
 * <li>Produce a SVG graph of a Puppet Catalog</li>
 * <li>Produce a SVG graph of the difference of two Puppet Catalogs</li>
 * </ul>
 * 
 */
public class CatalogServices {

	private Class<? extends IHrefProducer> hrefProducer;

	private String prefix;

	public CatalogServices() {
		hrefProducer = IHrefProducer.class;
		prefix = "";
	}

	public CatalogServices(GraphHrefType graphHrefType, String prefix) {
		this.hrefProducer = getHrefProducerClass(graphHrefType);
		this.prefix = prefix;
	}

	private Class<? extends IHrefProducer> getHrefProducerClass(GraphHrefType graphHrefType) {
		// if null, use the producer configured in the module
		if(graphHrefType != null)

			switch(graphHrefType.getValue()) {
				case GraphHrefType.ABSOLUTE_FILE_VALUE:
					return AbsoluteFileHrefProducer.class;
				case GraphHrefType.RELATIVE_FILE_VALUE:
					return RelativeFileHrefProducer.class;
				case GraphHrefType.JS_VALUE:
					return JavascriptHrefProducer.class;
				case GraphHrefType.GITHUB_VALUE:
					return GithubURLHrefProducer.class;
				case GraphHrefType.NONE_VALUE:
					return EmptyStringHrefProducer.class;
			}
		return IHrefProducer.class;

	}

	@Deprecated
	public void produceDOTDeltaGraph(String catalogName, InputStream oldCatalogStream, InputStream newCatalogStream,
			OutputStream dotStream, IProgressMonitor monitor) throws IOException {
		produceDOTDeltaGraph(catalogName, oldCatalogStream, null, newCatalogStream, null, dotStream, monitor);
	}

	/**
	 * Produces a graph depicting the old and new and the delta between them. Output is in SVG format.
	 * 
	 * @param catalogName
	 *        The name to generate as title in the graph. May be <code>null</code>
	 * @param oldCatalogSream
	 * @param newCatalogStream
	 * @param svgStream
	 * @param monitor
	 * @param root
	 *        - the root for files listed as source files in the catalog
	 */
	public void produceDOTDeltaGraph(String catalogName, InputStream oldCatalogStream, IPath oldRoot,
			InputStream newCatalogStream, IPath newRoot, OutputStream dotStream, IProgressMonitor monitor)
			throws IOException {
		final SubMonitor ticker = SubMonitor.convert(monitor, 1000);
		CatalogDeltaGraphProducer graphProducer = new CatalogDeltaGraphProducer(hrefProducer, prefix);
		Catalog oldCatalog = CatalogJsonSerializer.load(oldCatalogStream);
		Catalog newCatalog = CatalogJsonSerializer.load(newCatalogStream);

		ICancel cancel = new ProgressMonitorCancelIndicator(ticker.newChild(IProgressMonitor.UNKNOWN), 1000);
		graphProducer.produceGraph(cancel, catalogName, oldCatalog, oldRoot, newCatalog, newRoot, dotStream);
	}

	@Deprecated
	public void produceDOTGraph(String catalogName, InputStream catalogStream, OutputStream dotStream,
			IProgressMonitor monitor) throws IOException {
		produceDOTGraph(catalogName, catalogStream, dotStream, monitor, null);
	}

	public void produceDOTGraph(String catalogName, InputStream catalogStream, OutputStream dotStream,
			IProgressMonitor monitor, IPath root) throws IOException {
		final SubMonitor ticker = SubMonitor.convert(monitor, 1000);
		CatalogGraphProducer graphProducer = new CatalogGraphProducer(hrefProducer, prefix);
		ICancel cancel = new ProgressMonitorCancelIndicator(ticker.newChild(IProgressMonitor.UNKNOWN), 1000);
		Catalog catalog = CatalogJsonSerializer.load(catalogStream);

		graphProducer.produceGraph(cancel, catalog, catalogName, dotStream, root);
	}

	@Deprecated
	public void produceSVGDeltaGraph(String catalogName, InputStream oldCatalogStream, InputStream newCatalogStream,
			OutputStream svgStream, IProgressMonitor monitor) throws IOException {
		produceSVGDeltaGraph(catalogName, oldCatalogStream, null, newCatalogStream, null, svgStream, monitor);
	}

	/**
	 * Produces a graph depicting the old and new and the delta between them. Output is in SVG format.
	 * 
	 * @param catalogName
	 *        The name to generate as title in the graph. May be <code>null</code>
	 * @param oldCatalogSream
	 * @param newCatalogStream
	 * @param svgStream
	 * @param monitor
	 * @param root
	 *        - the root for files listed as source files in the catalog
	 */
	public void produceSVGDeltaGraph(String catalogName, InputStream oldCatalogStream, IPath oldRoot,
			InputStream newCatalogStream, IPath newRoot, OutputStream svgStream, IProgressMonitor monitor)
			throws IOException {
		final SubMonitor ticker = SubMonitor.convert(monitor, 2000);
		CatalogDeltaGraphProducer graphProducer = new CatalogDeltaGraphProducer(hrefProducer, prefix);
		Catalog oldCatalog = CatalogJsonSerializer.load(oldCatalogStream);
		Catalog newCatalog = CatalogJsonSerializer.load(newCatalogStream);

		ICancel cancel = new ProgressMonitorCancelIndicator(ticker.newChild(IProgressMonitor.UNKNOWN), 1000);

		ByteArrayOutputStream2 out = new ByteArrayOutputStream2();

		graphProducer.produceGraph(cancel, catalogName, oldCatalog, oldRoot, newCatalog, newRoot, out);
		graphProducer.getSVGProducer().produceSVG(out.toInputStream(false), svgStream, false, //
		ticker.newChild(IProgressMonitor.UNKNOWN));
	}

	@Deprecated
	public void produceSVGGraph(String catalogName, InputStream catalogStream, OutputStream svgStream,
			IProgressMonitor monitor) throws IOException {
		produceSVGGraph(catalogName, catalogStream, svgStream, monitor, null);
	}

	public void produceSVGGraph(String catalogName, InputStream catalogStream, OutputStream svgStream,
			IProgressMonitor monitor, IPath root) throws IOException {
		final SubMonitor ticker = SubMonitor.convert(monitor, 2000);
		CatalogGraphProducer graphProducer = new CatalogGraphProducer(hrefProducer, prefix);
		ICancel cancel = new ProgressMonitorCancelIndicator(ticker.newChild(IProgressMonitor.UNKNOWN), 1000);
		Catalog catalog = CatalogJsonSerializer.load(catalogStream);

		ByteArrayOutputStream2 out = new ByteArrayOutputStream2();
		graphProducer.produceGraph(cancel, catalog, catalogName, out, root);
		graphProducer.getSVGProducer().produceSVG(out.toInputStream(false), svgStream, false, //
		ticker.newChild(IProgressMonitor.UNKNOWN));
	}
}
