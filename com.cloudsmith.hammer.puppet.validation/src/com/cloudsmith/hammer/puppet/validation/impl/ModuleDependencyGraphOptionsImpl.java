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
package com.cloudsmith.hammer.puppet.validation.impl;

import java.io.File;
import java.io.OutputStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.cloudsmith.hammer.puppet.validation.GraphHrefType;
import com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions;
import com.cloudsmith.hammer.puppet.validation.ValidationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Dependency Graph Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl#getDotStream <em>Dot Stream</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl#getTitle <em>Title</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl#getModulesToGraph <em>Modules To
 * Graph</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl#getGraphHrefType <em>Graph Href
 * Type</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl#getGraphHrefPrefix <em>Graph Href
 * Prefix</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ModuleDependencyGraphOptionsImpl extends EObjectImpl implements ModuleDependencyGraphOptions {
	/**
	 * The default value of the '{@link #getDotStream() <em>Dot Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDotStream()
	 * @generated
	 * @ordered
	 */
	protected static final OutputStream DOT_STREAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDotStream() <em>Dot Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDotStream()
	 * @generated
	 * @ordered
	 */
	protected OutputStream dotStream = DOT_STREAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulesToGraph() <em>Modules To Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getModulesToGraph()
	 * @generated
	 * @ordered
	 */
	protected static final File[] MODULES_TO_GRAPH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulesToGraph() <em>Modules To Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getModulesToGraph()
	 * @generated
	 * @ordered
	 */
	protected File[] modulesToGraph = MODULES_TO_GRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphHrefType() <em>Graph Href Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGraphHrefType()
	 * @generated
	 * @ordered
	 */
	protected static final GraphHrefType GRAPH_HREF_TYPE_EDEFAULT = GraphHrefType.JS;

	/**
	 * The cached value of the '{@link #getGraphHrefType() <em>Graph Href Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGraphHrefType()
	 * @generated
	 * @ordered
	 */
	protected GraphHrefType graphHrefType = GRAPH_HREF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraphHrefPrefix() <em>Graph Href Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGraphHrefPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPH_HREF_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphHrefPrefix() <em>Graph Href Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGraphHrefPrefix()
	 * @generated
	 * @ordered
	 */
	protected String graphHrefPrefix = GRAPH_HREF_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ModuleDependencyGraphOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM:
				return getDotStream();
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE:
				return getTitle();
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH:
				return getModulesToGraph();
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE:
				return getGraphHrefType();
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX:
				return getGraphHrefPrefix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM:
				return DOT_STREAM_EDEFAULT == null
						? dotStream != null
						: !DOT_STREAM_EDEFAULT.equals(dotStream);
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE:
				return TITLE_EDEFAULT == null
						? title != null
						: !TITLE_EDEFAULT.equals(title);
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH:
				return MODULES_TO_GRAPH_EDEFAULT == null
						? modulesToGraph != null
						: !MODULES_TO_GRAPH_EDEFAULT.equals(modulesToGraph);
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE:
				return graphHrefType != GRAPH_HREF_TYPE_EDEFAULT;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX:
				return GRAPH_HREF_PREFIX_EDEFAULT == null
						? graphHrefPrefix != null
						: !GRAPH_HREF_PREFIX_EDEFAULT.equals(graphHrefPrefix);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM:
				setDotStream((OutputStream) newValue);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE:
				setTitle((String) newValue);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH:
				setModulesToGraph((File[]) newValue);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE:
				setGraphHrefType((GraphHrefType) newValue);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX:
				setGraphHrefPrefix((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationPackage.Literals.MODULE_DEPENDENCY_GRAPH_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM:
				setDotStream(DOT_STREAM_EDEFAULT);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH:
				setModulesToGraph(MODULES_TO_GRAPH_EDEFAULT);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE:
				setGraphHrefType(GRAPH_HREF_TYPE_EDEFAULT);
				return;
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX:
				setGraphHrefPrefix(GRAPH_HREF_PREFIX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutputStream getDotStream() {
		return dotStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getGraphHrefPrefix() {
		return graphHrefPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphHrefType getGraphHrefType() {
		return graphHrefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public File[] getModulesToGraph() {
		return modulesToGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDotStream(OutputStream newDotStream) {
		OutputStream oldDotStream = dotStream;
		dotStream = newDotStream;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM, oldDotStream,
				dotStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGraphHrefPrefix(String newGraphHrefPrefix) {
		String oldGraphHrefPrefix = graphHrefPrefix;
		graphHrefPrefix = newGraphHrefPrefix;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX,
				oldGraphHrefPrefix, graphHrefPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGraphHrefType(GraphHrefType newGraphHrefType) {
		GraphHrefType oldGraphHrefType = graphHrefType;
		graphHrefType = newGraphHrefType == null
				? GRAPH_HREF_TYPE_EDEFAULT
				: newGraphHrefType;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE,
				oldGraphHrefType, graphHrefType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModulesToGraph(File[] newModulesToGraph) {
		File[] oldModulesToGraph = modulesToGraph;
		modulesToGraph = newModulesToGraph;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH,
				oldModulesToGraph, modulesToGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dotStream: ");
		result.append(dotStream);
		result.append(", title: ");
		result.append(title);
		result.append(", modulesToGraph: ");
		result.append(modulesToGraph);
		result.append(", graphHrefType: ");
		result.append(graphHrefType);
		result.append(", graphHrefPrefix: ");
		result.append(graphHrefPrefix);
		result.append(')');
		return result.toString();
	}

} // ModuleDependencyGraphOptionsImpl
