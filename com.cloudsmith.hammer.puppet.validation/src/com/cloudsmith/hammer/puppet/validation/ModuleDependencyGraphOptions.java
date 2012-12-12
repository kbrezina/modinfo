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
package com.cloudsmith.hammer.puppet.validation;

import java.io.File;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Dependency Graph Options</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getDotStream <em>Dot Stream</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getTitle <em>Title</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getModulesToGraph <em>Modules To Graph</em>}
 * </li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefType <em>Graph Href Type</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefPrefix <em>Graph Href Prefix</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getModuleDependencyGraphOptions()
 * @model
 * @generated
 */
public interface ModuleDependencyGraphOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Dot Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stream where output text is written. Should be a buffered stream for best performance.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Dot Stream</em>' attribute.
	 * @see #setDotStream(OutputStream)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getModuleDependencyGraphOptions_DotStream()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.OutputStream" required="true"
	 * @generated
	 */
	OutputStream getDotStream();

	/**
	 * Returns the value of the '<em><b>Graph Href Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Href Prefix</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Graph Href Prefix</em>' attribute.
	 * @see #setGraphHrefPrefix(String)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getModuleDependencyGraphOptions_GraphHrefPrefix()
	 * @model
	 * @generated
	 */
	String getGraphHrefPrefix();

	/**
	 * Returns the value of the '<em><b>Graph Href Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cloudsmith.hammer.puppet.validation.GraphHrefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Href Type</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Graph Href Type</em>' attribute.
	 * @see com.cloudsmith.hammer.puppet.validation.GraphHrefType
	 * @see #setGraphHrefType(GraphHrefType)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getModuleDependencyGraphOptions_GraphHrefType()
	 * @model
	 * @generated
	 */
	GraphHrefType getGraphHrefType();

	/**
	 * Returns the value of the '<em><b>Modules To Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If unset, all modules found in the given data are included in the graph. When set, this array should contain references to
	 * the directories that represents modules. The transitive dependencies of such modules are then included in the graph.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Modules To Graph</em>' attribute.
	 * @see #setModulesToGraph(File[])
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getModuleDependencyGraphOptions_ModulesToGraph()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.FileArray"
	 * @generated
	 */
	File[] getModulesToGraph();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title (in the upper left corner of the generated graph). If unset, a deault title is generated. If no title is wanted,
	 * set it to an empty string.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getModuleDependencyGraphOptions_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getDotStream <em>Dot
	 * Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Dot Stream</em>' attribute.
	 * @see #getDotStream()
	 * @generated
	 */
	void setDotStream(OutputStream value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefPrefix
	 * <em>Graph Href Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Graph Href Prefix</em>' attribute.
	 * @see #getGraphHrefPrefix()
	 * @generated
	 */
	void setGraphHrefPrefix(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefType
	 * <em>Graph Href Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Graph Href Type</em>' attribute.
	 * @see com.cloudsmith.hammer.puppet.validation.GraphHrefType
	 * @see #getGraphHrefType()
	 * @generated
	 */
	void setGraphHrefType(GraphHrefType value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getModulesToGraph
	 * <em>Modules To Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Modules To Graph</em>' attribute.
	 * @see #getModulesToGraph()
	 * @generated
	 */
	void setModulesToGraph(File[] value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getTitle <em>Title</em>}
	 * ' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // ModuleDependencyGraphOptions
