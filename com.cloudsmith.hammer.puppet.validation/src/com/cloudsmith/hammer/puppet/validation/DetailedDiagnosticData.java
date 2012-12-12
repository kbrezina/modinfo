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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detailed Diagnostic Data</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getOffset <em>Offset</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getLength <em>Length</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssue <em>Issue</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssueData <em>Issue Data</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDetailedDiagnosticData()
 * @model
 * @generated
 */
public interface DetailedDiagnosticData extends DiagnosticData {
	/**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The issue is a String naming a particular issue that makes it possible to have a more detailed understanding of an error
	 * and what could be done to repair it. (As opposed to parsing the error message to gain an understanding). Error messages may
	 * be subject to NLS translation, but never the issue name.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see #setIssue(String)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDetailedDiagnosticData_Issue()
	 * @model required="true"
	 * @generated
	 */
	String getIssue();

	/**
	 * Returns the value of the '<em><b>Issue Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The issue data is optional data associated with a particular issue - it is typically used to pass values calculated during
	 * validation and that may be meaningful to code that tries to repair or analyze a particular problem and where it may be
	 * expensive to recompute these values.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Issue Data</em>' attribute.
	 * @see #setIssueData(String[])
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDetailedDiagnosticData_IssueData()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.StringArray"
	 * @generated
	 */
	String[] getIssueData();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length is the length (from offset) that is the textual representation that the diagnostic apply to , or 0 if there where no
	 * visible textual representation.
	 * A length of -1 indicates that length is irrelevant.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(Integer)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDetailedDiagnosticData_Length()
	 * @model required="true"
	 * @generated
	 */
	Integer getLength();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The offest from the beginning of the parsed text, or -1 if offset is not available.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Integer)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getDetailedDiagnosticData_Offset()
	 * @model required="true"
	 * @generated
	 */
	Integer getOffset();

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssue <em>Issue</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssueData <em>Issue
	 * Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Issue Data</em>' attribute.
	 * @see #getIssueData()
	 * @generated
	 */
	void setIssueData(String[] value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getLength <em>Length</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Integer value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getOffset <em>Offset</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Integer value);

} // DetailedDiagnosticData
