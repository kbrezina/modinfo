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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Data</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getFile <em>File</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getLineNumber <em>Line Number</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDiagnosticData()
 * @model
 * @generated
 */
public interface DiagnosticData extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File is a reference to a relative or absolute file, or is empty/null if the diagnostic is not file related.
	 * 
	 * All diagnostic relating to files given (directly or contained) in the calls to the ValidationService will be reported with
	 * path's relative to the given root, or in the case of a single file, the leaf part of the path (the file name). Diagnostics
	 * relating to absolute files may appear - these may refer to files that are used by a particular diagnostician (e.g. system
	 * libraries or general configuration files).
	 * 
	 * Also see #node.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(File)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDiagnosticData_File()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.File"
	 * @generated
	 */
	File getFile();

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Line number is the (first) line for which a diagnostician reported the diagnostic, or -1 if linenumber is irrelevant (or if
	 * file is null or empty).
	 * Note that some diagnosticians may return a DetailedDiagnosticData with further information.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(Integer)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDiagnosticData_LineNumber()
	 * @model default="-1"
	 * @generated
	 */
	Integer getLineNumber();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node name is a symbolic reference to the host where the filename is relevant, or the node associated with a particular
	 * diagnostic
	 * (a particular file may have diagnostics that are only relevant for a particular node, but reporting a diagnostic for a
	 * particular
	 * node does not indicate that the problem relates only to this node, only that it was detected during processing of the given
	 * node).
	 * The special node "SERVER" indicates if the problem was diagnosed as pertaining to the server side.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDiagnosticData_Node()
	 * @model
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getLineNumber <em>Line Number</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
	void setLineNumber(Integer value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

} // DiagnosticData
