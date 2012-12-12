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

import com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider;
import org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor;
import org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getFileType <em>File Type</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckLayout <em>Check Layout</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckModuleSemantics <em>Check Module Semantics</em>}
 * </li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckReferences <em>Check References</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getPlatformURI <em>Platform URI</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getDependencyGraphOptions <em>Dependency Graph
 * Options</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEncodingProvider <em>Encoding Provider</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEnvironment <em>Environment</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getSearchPath <em>Search Path</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getComplianceLevel <em>Compliance Level</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getProblemsAdvisor <em>Problems Advisor</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions()
 * @model
 * @generated
 */
public interface ValidationOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Compliance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defaults to 2.7 if not specified.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Compliance Level</em>' attribute.
	 * @see #setComplianceLevel(ComplianceLevel)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_ComplianceLevel()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.ComplianceLevel"
	 * @generated
	 */
	ComplianceLevel getComplianceLevel();

	/**
	 * Returns the value of the '<em><b>Dependency Graph Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Graph Options</em>' containment reference isn't clear, there really should be more of
	 * a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dependency Graph Options</em>' containment reference.
	 * @see #setDependencyGraphOptions(ModuleDependencyGraphOptions)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_DependencyGraphOptions()
	 * @model containment="true"
	 * @generated
	 */
	ModuleDependencyGraphOptions getDependencyGraphOptions();

	/**
	 * Returns the value of the '<em><b>Encoding Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding Provider</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Encoding Provider</em>' attribute.
	 * @see #setEncodingProvider(IEncodingProvider)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_EncodingProvider()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.IEncodingProvider"
	 * @generated
	 */
	IEncodingProvider getEncodingProvider();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_Environment()
	 * @model
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cloudsmith.hammer.puppet.validation.FileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see com.cloudsmith.hammer.puppet.validation.FileType
	 * @see #setFileType(FileType)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_FileType()
	 * @model required="true"
	 * @generated
	 */
	FileType getFileType();

	/**
	 * Returns the value of the '<em><b>Platform URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URI to a pptp resource in string form. If null, a default pptp will be used when validating. An unloadable pptp reference
	 * will result in an internal error.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Platform URI</em>' attribute.
	 * @see #setPlatformURI(URI)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_PlatformURI()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.URI"
	 * @generated
	 */
	URI getPlatformURI();

	/**
	 * Returns the value of the '<em><b>Problems Advisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems Advisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Problems Advisor</em>' attribute.
	 * @see #setProblemsAdvisor(IPotentialProblemsAdvisor)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_ProblemsAdvisor()
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.IPotentialProblemsAdvisor"
	 * @generated
	 */
	IPotentialProblemsAdvisor getProblemsAdvisor();

	/**
	 * Returns the value of the '<em><b>Search Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Path</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Search Path</em>' attribute.
	 * @see #setSearchPath(String)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_SearchPath()
	 * @model
	 * @generated
	 */
	String getSearchPath();

	/**
	 * Returns the value of the '<em><b>Check Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Layout</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Check Layout</em>' attribute.
	 * @see #setCheckLayout(boolean)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_CheckLayout()
	 * @model required="true"
	 * @generated
	 */
	boolean isCheckLayout();

	/**
	 * Returns the value of the '<em><b>Check Module Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checking module semantics means that the module's dependencies are satisfied.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Check Module Semantics</em>' attribute.
	 * @see #setCheckModuleSemantics(boolean)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_CheckModuleSemantics()
	 * @model required="true"
	 * @generated
	 */
	boolean isCheckModuleSemantics();

	/**
	 * Returns the value of the '<em><b>Check References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check References</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Check References</em>' attribute.
	 * @see #setCheckReferences(boolean)
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationOptions_CheckReferences()
	 * @model required="true"
	 * @generated
	 */
	boolean isCheckReferences();

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckLayout <em>Check
	 * Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Check Layout</em>' attribute.
	 * @see #isCheckLayout()
	 * @generated
	 */
	void setCheckLayout(boolean value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckModuleSemantics <em>Check
	 * Module Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Check Module Semantics</em>' attribute.
	 * @see #isCheckModuleSemantics()
	 * @generated
	 */
	void setCheckModuleSemantics(boolean value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckReferences <em>Check
	 * References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Check References</em>' attribute.
	 * @see #isCheckReferences()
	 * @generated
	 */
	void setCheckReferences(boolean value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getComplianceLevel <em>Compliance
	 * Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Compliance Level</em>' attribute.
	 * @see #getComplianceLevel()
	 * @generated
	 */
	void setComplianceLevel(ComplianceLevel value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getDependencyGraphOptions
	 * <em>Dependency Graph Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Dependency Graph Options</em>' containment reference.
	 * @see #getDependencyGraphOptions()
	 * @generated
	 */
	void setDependencyGraphOptions(ModuleDependencyGraphOptions value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEncodingProvider <em>Encoding
	 * Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Encoding Provider</em>' attribute.
	 * @see #getEncodingProvider()
	 * @generated
	 */
	void setEncodingProvider(IEncodingProvider value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEnvironment
	 * <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getFileType <em>File Type</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see com.cloudsmith.hammer.puppet.validation.FileType
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(FileType value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getPlatformURI <em>Platform
	 * URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Platform URI</em>' attribute.
	 * @see #getPlatformURI()
	 * @generated
	 */
	void setPlatformURI(URI value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getProblemsAdvisor <em>Problems
	 * Advisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Problems Advisor</em>' attribute.
	 * @see #getProblemsAdvisor()
	 * @generated
	 */
	void setProblemsAdvisor(IPotentialProblemsAdvisor value);

	/**
	 * Sets the value of the '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getSearchPath <em>Search Path</em>}
	 * ' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Search Path</em>' attribute.
	 * @see #getSearchPath()
	 * @generated
	 */
	void setSearchPath(String value);

} // ValidationOptions
