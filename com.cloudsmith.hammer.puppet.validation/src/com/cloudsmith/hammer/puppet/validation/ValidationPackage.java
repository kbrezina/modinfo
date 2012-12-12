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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationServiceImpl
		 * <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationServiceImpl
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getValidationService()
		 * @generated
		 */
		EClass VALIDATION_SERVICE = eINSTANCE.getValidationService();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.impl.DiagnosticDataImpl <em>Diagnostic
		 * Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.impl.DiagnosticDataImpl
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getDiagnosticData()
		 * @generated
		 */
		EClass DIAGNOSTIC_DATA = eINSTANCE.getDiagnosticData();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGNOSTIC_DATA__FILE = eINSTANCE.getDiagnosticData_File();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGNOSTIC_DATA__LINE_NUMBER = eINSTANCE.getDiagnosticData_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIAGNOSTIC_DATA__NODE = eINSTANCE.getDiagnosticData_Node();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl
		 * <em>Detailed Diagnostic Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getDetailedDiagnosticData()
		 * @generated
		 */
		EClass DETAILED_DIAGNOSTIC_DATA = eINSTANCE.getDetailedDiagnosticData();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DETAILED_DIAGNOSTIC_DATA__OFFSET = eINSTANCE.getDetailedDiagnosticData_Offset();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DETAILED_DIAGNOSTIC_DATA__LENGTH = eINSTANCE.getDetailedDiagnosticData_Length();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DETAILED_DIAGNOSTIC_DATA__ISSUE = eINSTANCE.getDetailedDiagnosticData_Issue();

		/**
		 * The meta object literal for the '<em><b>Issue Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA = eINSTANCE.getDetailedDiagnosticData_IssueData();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl
		 * <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getValidationOptions()
		 * @generated
		 */
		EClass VALIDATION_OPTIONS = eINSTANCE.getValidationOptions();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__FILE_TYPE = eINSTANCE.getValidationOptions_FileType();

		/**
		 * The meta object literal for the '<em><b>Check Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__CHECK_LAYOUT = eINSTANCE.getValidationOptions_CheckLayout();

		/**
		 * The meta object literal for the '<em><b>Check Module Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS = eINSTANCE.getValidationOptions_CheckModuleSemantics();

		/**
		 * The meta object literal for the '<em><b>Check References</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__CHECK_REFERENCES = eINSTANCE.getValidationOptions_CheckReferences();

		/**
		 * The meta object literal for the '<em><b>Platform URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__PLATFORM_URI = eINSTANCE.getValidationOptions_PlatformURI();

		/**
		 * The meta object literal for the '<em><b>Dependency Graph Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS = eINSTANCE.getValidationOptions_DependencyGraphOptions();

		/**
		 * The meta object literal for the '<em><b>Encoding Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__ENCODING_PROVIDER = eINSTANCE.getValidationOptions_EncodingProvider();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__ENVIRONMENT = eINSTANCE.getValidationOptions_Environment();

		/**
		 * The meta object literal for the '<em><b>Search Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__SEARCH_PATH = eINSTANCE.getValidationOptions_SearchPath();

		/**
		 * The meta object literal for the '<em><b>Compliance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__COMPLIANCE_LEVEL = eINSTANCE.getValidationOptions_ComplianceLevel();

		/**
		 * The meta object literal for the '<em><b>Problems Advisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute VALIDATION_OPTIONS__PROBLEMS_ADVISOR = eINSTANCE.getValidationOptions_ProblemsAdvisor();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl
		 * <em>Module Dependency Graph Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getModuleDependencyGraphOptions()
		 * @generated
		 */
		EClass MODULE_DEPENDENCY_GRAPH_OPTIONS = eINSTANCE.getModuleDependencyGraphOptions();

		/**
		 * The meta object literal for the '<em><b>Dot Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM = eINSTANCE.getModuleDependencyGraphOptions_DotStream();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE = eINSTANCE.getModuleDependencyGraphOptions_Title();

		/**
		 * The meta object literal for the '<em><b>Modules To Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH = eINSTANCE.getModuleDependencyGraphOptions_ModulesToGraph();

		/**
		 * The meta object literal for the '<em><b>Graph Href Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE = eINSTANCE.getModuleDependencyGraphOptions_GraphHrefType();

		/**
		 * The meta object literal for the '<em><b>Graph Href Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX = eINSTANCE.getModuleDependencyGraphOptions_GraphHrefPrefix();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode
		 * <em>Service Diagnostic Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getValidationServiceDiagnosticCode()
		 * @generated
		 */
		EEnum VALIDATION_SERVICE_DIAGNOSTIC_CODE = eINSTANCE.getValidationServiceDiagnosticCode();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.FileType <em>File Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.FileType
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getFileType()
		 * @generated
		 */
		EEnum FILE_TYPE = eINSTANCE.getFileType();

		/**
		 * The meta object literal for the '{@link com.cloudsmith.hammer.puppet.validation.GraphHrefType <em>Graph Href Type</em>}
		 * ' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.GraphHrefType
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getGraphHrefType()
		 * @generated
		 */
		EEnum GRAPH_HREF_TYPE = eINSTANCE.getGraphHrefType();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.io.File
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.lang.Throwable
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getThrowable()
		 * @generated
		 */
		EDataType THROWABLE = eINSTANCE.getThrowable();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

		/**
		 * The meta object literal for the '<em>File Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getFileArray()
		 * @generated
		 */
		EDataType FILE_ARRAY = eINSTANCE.getFileArray();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Build Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.runner.BuildResult
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getBuildResult()
		 * @generated
		 */
		EDataType BUILD_RESULT = eINSTANCE.getBuildResult();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.emf.common.util.URI
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.io.OutputStream
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.io.InputStream
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.io.IOException
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>IEncoding Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIEncodingProvider()
		 * @generated
		 */
		EDataType IENCODING_PROVIDER = eINSTANCE.getIEncodingProvider();

		/**
		 * The meta object literal for the '<em>Compliance Level</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getComplianceLevel()
		 * @generated
		 */
		EDataType COMPLIANCE_LEVEL = eINSTANCE.getComplianceLevel();

		/**
		 * The meta object literal for the '<em>IPotential Problems Advisor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor
		 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIPotentialProblemsAdvisor()
		 * @generated
		 */
		EDataType IPOTENTIAL_PROBLEMS_ADVISOR = eINSTANCE.getIPotentialProblemsAdvisor();

	}

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "validation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.cloudsmith.com/hammer/1.0.0/Puppet/Validation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "validation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ValidationPackage eINSTANCE = com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationServiceImpl <em>Service</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationServiceImpl
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getValidationService()
	 * @generated
	 */
	int VALIDATION_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.impl.DiagnosticDataImpl <em>Diagnostic
	 * Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.impl.DiagnosticDataImpl
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getDiagnosticData()
	 * @generated
	 */
	int DIAGNOSTIC_DATA = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_DATA__FILE = 0;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_DATA__LINE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_DATA__NODE = 2;

	/**
	 * The number of structural features of the '<em>Diagnostic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl <em>Detailed
	 * Diagnostic Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getDetailedDiagnosticData()
	 * @generated
	 */
	int DETAILED_DIAGNOSTIC_DATA = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA__FILE = DIAGNOSTIC_DATA__FILE;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA__LINE_NUMBER = DIAGNOSTIC_DATA__LINE_NUMBER;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA__NODE = DIAGNOSTIC_DATA__NODE;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA__OFFSET = DIAGNOSTIC_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA__LENGTH = DIAGNOSTIC_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA__ISSUE = DIAGNOSTIC_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issue Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA = DIAGNOSTIC_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Detailed Diagnostic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DETAILED_DIAGNOSTIC_DATA_FEATURE_COUNT = DIAGNOSTIC_DATA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl <em>Options</em>}'
	 * class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getValidationOptions()
	 * @generated
	 */
	int VALIDATION_OPTIONS = 3;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__FILE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Check Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__CHECK_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Check Module Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS = 2;

	/**
	 * The feature id for the '<em><b>Check References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__CHECK_REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Platform URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__PLATFORM_URI = 4;

	/**
	 * The feature id for the '<em><b>Dependency Graph Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Encoding Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__ENCODING_PROVIDER = 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__ENVIRONMENT = 7;

	/**
	 * The feature id for the '<em><b>Search Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__SEARCH_PATH = 8;

	/**
	 * The feature id for the '<em><b>Compliance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__COMPLIANCE_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Problems Advisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS__PROBLEMS_ADVISOR = 10;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VALIDATION_OPTIONS_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl <em>Module
	 * Dependency Graph Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ModuleDependencyGraphOptionsImpl
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getModuleDependencyGraphOptions()
	 * @generated
	 */
	int MODULE_DEPENDENCY_GRAPH_OPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Dot Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Modules To Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Graph Href Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Graph Href Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX = 4;

	/**
	 * The number of structural features of the '<em>Module Dependency Graph Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULE_DEPENDENCY_GRAPH_OPTIONS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode <em>Service
	 * Diagnostic Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getValidationServiceDiagnosticCode()
	 * @generated
	 */
	int VALIDATION_SERVICE_DIAGNOSTIC_CODE = 5;

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.FileType <em>File Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.FileType
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 6;

	/**
	 * The meta object id for the '{@link com.cloudsmith.hammer.puppet.validation.GraphHrefType <em>Graph Href Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.GraphHrefType
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getGraphHrefType()
	 * @generated
	 */
	int GRAPH_HREF_TYPE = 7;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.io.File
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 8;

	/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.lang.Throwable
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 9;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 10;

	/**
	 * The meta object id for the '<em>File Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getFileArray()
	 * @generated
	 */
	int FILE_ARRAY = 11;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 12;

	/**
	 * The meta object id for the '<em>Build Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.runner.BuildResult
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getBuildResult()
	 * @generated
	 */
	int BUILD_RESULT = 13;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.URI
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getURI()
	 * @generated
	 */
	int URI = 14;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.io.OutputStream
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 15;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.io.InputStream
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 16;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.io.IOException
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 17;

	/**
	 * The meta object id for the '<em>IEncoding Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIEncodingProvider()
	 * @generated
	 */
	int IENCODING_PROVIDER = 18;

	/**
	 * The meta object id for the '<em>Compliance Level</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getComplianceLevel()
	 * @generated
	 */
	int COMPLIANCE_LEVEL = 19;

	/**
	 * The meta object id for the '<em>IPotential Problems Advisor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor
	 * @see com.cloudsmith.hammer.puppet.validation.impl.ValidationPackageImpl#getIPotentialProblemsAdvisor()
	 * @generated
	 */
	int IPOTENTIAL_PROBLEMS_ADVISOR = 20;

	/**
	 * Returns the meta object for data type '{@link com.cloudsmith.hammer.puppet.validation.runner.BuildResult <em>Build
	 * Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Build Result</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.runner.BuildResult
	 * @model instanceClass="com.cloudsmith.hammer.puppet.validation.runner.BuildResult"
	 * @generated
	 */
	EDataType getBuildResult();

	/**
	 * Returns the meta object for data type '{@link org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel
	 * <em>Compliance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Compliance Level</em>'.
	 * @see org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel
	 * @model instanceClass="org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel"
	 * @generated
	 */
	EDataType getComplianceLevel();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData <em>Detailed
	 * Diagnostic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Detailed Diagnostic Data</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData
	 * @generated
	 */
	EClass getDetailedDiagnosticData();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssue
	 * <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssue()
	 * @see #getDetailedDiagnosticData()
	 * @generated
	 */
	EAttribute getDetailedDiagnosticData_Issue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssueData <em>Issue Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Issue Data</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getIssueData()
	 * @see #getDetailedDiagnosticData()
	 * @generated
	 */
	EAttribute getDetailedDiagnosticData_IssueData();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getLength
	 * <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getLength()
	 * @see #getDetailedDiagnosticData()
	 * @generated
	 */
	EAttribute getDetailedDiagnosticData_Length();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getOffset
	 * <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData#getOffset()
	 * @see #getDetailedDiagnosticData()
	 * @generated
	 */
	EAttribute getDetailedDiagnosticData_Offset();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData <em>Diagnostic Data</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Diagnostic Data</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DiagnosticData
	 * @generated
	 */
	EClass getDiagnosticData();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getFile
	 * <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DiagnosticData#getFile()
	 * @see #getDiagnosticData()
	 * @generated
	 */
	EAttribute getDiagnosticData_File();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getLineNumber
	 * <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DiagnosticData#getLineNumber()
	 * @see #getDiagnosticData()
	 * @generated
	 */
	EAttribute getDiagnosticData_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData#getNode
	 * <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.DiagnosticData#getNode()
	 * @see #getDiagnosticData()
	 * @generated
	 */
	EAttribute getDiagnosticData_Node();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the meta object for data type '<em>File Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>File Array</em>'.
	 * @model instanceClass="java.io.File[]"
	 * @generated
	 */
	EDataType getFileArray();

	/**
	 * Returns the meta object for enum '{@link com.cloudsmith.hammer.puppet.validation.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>File Type</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.FileType
	 * @generated
	 */
	EEnum getFileType();

	/**
	 * Returns the meta object for enum '{@link com.cloudsmith.hammer.puppet.validation.GraphHrefType <em>Graph Href Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Graph Href Type</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.GraphHrefType
	 * @generated
	 */
	EEnum getGraphHrefType();

	/**
	 * Returns the meta object for data type '{@link com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider
	 * <em>IEncoding Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IEncoding Provider</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider
	 * @model instanceClass="com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider"
	 * @generated
	 */
	EDataType getIEncodingProvider();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '{@link org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor
	 * <em>IPotential Problems Advisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IPotential Problems Advisor</em>'.
	 * @see org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor
	 * @model instanceClass="org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor"
	 * @generated
	 */
	EDataType getIPotentialProblemsAdvisor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor" serializeable="false"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions <em>Module
	 * Dependency Graph Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Module Dependency Graph Options</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions
	 * @generated
	 */
	EClass getModuleDependencyGraphOptions();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getDotStream <em>Dot Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Dot Stream</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getDotStream()
	 * @see #getModuleDependencyGraphOptions()
	 * @generated
	 */
	EAttribute getModuleDependencyGraphOptions_DotStream();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefPrefix <em>Graph Href Prefix</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Graph Href Prefix</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefPrefix()
	 * @see #getModuleDependencyGraphOptions()
	 * @generated
	 */
	EAttribute getModuleDependencyGraphOptions_GraphHrefPrefix();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefType <em>Graph Href Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Graph Href Type</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getGraphHrefType()
	 * @see #getModuleDependencyGraphOptions()
	 * @generated
	 */
	EAttribute getModuleDependencyGraphOptions_GraphHrefType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getModulesToGraph <em>Modules To Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Modules To Graph</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getModulesToGraph()
	 * @see #getModuleDependencyGraphOptions()
	 * @generated
	 */
	EAttribute getModuleDependencyGraphOptions_ModulesToGraph();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions#getTitle()
	 * @see #getModuleDependencyGraphOptions()
	 * @generated
	 */
	EAttribute getModuleDependencyGraphOptions_Title();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getOutputStream();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getStringArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getThrowable();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationFactory getValidationFactory();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Options</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions
	 * @generated
	 */
	EClass getValidationOptions();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckLayout
	 * <em>Check Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Check Layout</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckLayout()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_CheckLayout();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckModuleSemantics <em>Check Module Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Check Module Semantics</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckModuleSemantics()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_CheckModuleSemantics();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckReferences <em>Check References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Check References</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#isCheckReferences()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_CheckReferences();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getComplianceLevel <em>Compliance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Compliance Level</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getComplianceLevel()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_ComplianceLevel();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getDependencyGraphOptions <em>Dependency Graph
	 * Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Dependency Graph Options</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getDependencyGraphOptions()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EReference getValidationOptions_DependencyGraphOptions();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEncodingProvider <em>Encoding Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Encoding Provider</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEncodingProvider()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_EncodingProvider();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEnvironment
	 * <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Environment</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getEnvironment()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_Environment();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getFileType
	 * <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getFileType()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_FileType();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getPlatformURI
	 * <em>Platform URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Platform URI</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getPlatformURI()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_PlatformURI();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getProblemsAdvisor <em>Problems Advisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Problems Advisor</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getProblemsAdvisor()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_ProblemsAdvisor();

	/**
	 * Returns the meta object for the attribute '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions#getSearchPath
	 * <em>Search Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Search Path</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions#getSearchPath()
	 * @see #getValidationOptions()
	 * @generated
	 */
	EAttribute getValidationOptions_SearchPath();

	/**
	 * Returns the meta object for class '{@link com.cloudsmith.hammer.puppet.validation.ValidationService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationService
	 * @generated
	 */
	EClass getValidationService();

	/**
	 * Returns the meta object for enum '{@link com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode
	 * <em>Service Diagnostic Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Service Diagnostic Code</em>'.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode
	 * @generated
	 */
	EEnum getValidationServiceDiagnosticCode();

} // ValidationPackage
