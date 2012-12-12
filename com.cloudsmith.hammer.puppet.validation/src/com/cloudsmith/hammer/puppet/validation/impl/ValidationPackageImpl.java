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

import com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData;
import com.cloudsmith.hammer.puppet.validation.DiagnosticData;
import com.cloudsmith.hammer.puppet.validation.FileType;
import com.cloudsmith.hammer.puppet.validation.GraphHrefType;
import com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions;
import com.cloudsmith.hammer.puppet.validation.ValidationFactory;
import com.cloudsmith.hammer.puppet.validation.ValidationOptions;
import com.cloudsmith.hammer.puppet.validation.ValidationPackage;
import com.cloudsmith.hammer.puppet.validation.ValidationService;
import com.cloudsmith.hammer.puppet.validation.ValidationServiceDiagnosticCode;

import com.cloudsmith.hammer.puppet.validation.runner.BuildResult;
import com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider;
import java.io.File;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor;
import org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValidationPackageImpl extends EPackageImpl implements ValidationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass validationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass diagnosticDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass detailedDiagnosticDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass validationOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass moduleDependencyGraphOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum validationServiceDiagnosticCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum fileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum graphHrefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType throwableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType stringArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType fileArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType buildResultEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType outputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iEncodingProviderEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType complianceLevelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType iPotentialProblemsAdvisorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ValidationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidationPackage init() {
		if(isInited)
			return (ValidationPackage) EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);

		// Obtain or create and register package
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValidationPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new ValidationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theValidationPackage.createPackageContents();

		// Initialize created meta-data
		theValidationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidationPackage.eNS_URI, theValidationPackage);
		return theValidationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidationPackageImpl() {
		super(eNS_URI, ValidationFactory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if(isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		validationServiceEClass = createEClass(VALIDATION_SERVICE);

		diagnosticDataEClass = createEClass(DIAGNOSTIC_DATA);
		createEAttribute(diagnosticDataEClass, DIAGNOSTIC_DATA__FILE);
		createEAttribute(diagnosticDataEClass, DIAGNOSTIC_DATA__LINE_NUMBER);
		createEAttribute(diagnosticDataEClass, DIAGNOSTIC_DATA__NODE);

		detailedDiagnosticDataEClass = createEClass(DETAILED_DIAGNOSTIC_DATA);
		createEAttribute(detailedDiagnosticDataEClass, DETAILED_DIAGNOSTIC_DATA__OFFSET);
		createEAttribute(detailedDiagnosticDataEClass, DETAILED_DIAGNOSTIC_DATA__LENGTH);
		createEAttribute(detailedDiagnosticDataEClass, DETAILED_DIAGNOSTIC_DATA__ISSUE);
		createEAttribute(detailedDiagnosticDataEClass, DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA);

		validationOptionsEClass = createEClass(VALIDATION_OPTIONS);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__FILE_TYPE);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__CHECK_LAYOUT);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__CHECK_REFERENCES);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__PLATFORM_URI);
		createEReference(validationOptionsEClass, VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__ENCODING_PROVIDER);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__ENVIRONMENT);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__SEARCH_PATH);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__COMPLIANCE_LEVEL);
		createEAttribute(validationOptionsEClass, VALIDATION_OPTIONS__PROBLEMS_ADVISOR);

		moduleDependencyGraphOptionsEClass = createEClass(MODULE_DEPENDENCY_GRAPH_OPTIONS);
		createEAttribute(moduleDependencyGraphOptionsEClass, MODULE_DEPENDENCY_GRAPH_OPTIONS__DOT_STREAM);
		createEAttribute(moduleDependencyGraphOptionsEClass, MODULE_DEPENDENCY_GRAPH_OPTIONS__TITLE);
		createEAttribute(moduleDependencyGraphOptionsEClass, MODULE_DEPENDENCY_GRAPH_OPTIONS__MODULES_TO_GRAPH);
		createEAttribute(moduleDependencyGraphOptionsEClass, MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_TYPE);
		createEAttribute(moduleDependencyGraphOptionsEClass, MODULE_DEPENDENCY_GRAPH_OPTIONS__GRAPH_HREF_PREFIX);

		// Create enums
		validationServiceDiagnosticCodeEEnum = createEEnum(VALIDATION_SERVICE_DIAGNOSTIC_CODE);
		fileTypeEEnum = createEEnum(FILE_TYPE);
		graphHrefTypeEEnum = createEEnum(GRAPH_HREF_TYPE);

		// Create data types
		fileEDataType = createEDataType(FILE);
		throwableEDataType = createEDataType(THROWABLE);
		stringArrayEDataType = createEDataType(STRING_ARRAY);
		fileArrayEDataType = createEDataType(FILE_ARRAY);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		buildResultEDataType = createEDataType(BUILD_RESULT);
		uriEDataType = createEDataType(URI);
		outputStreamEDataType = createEDataType(OUTPUT_STREAM);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		iEncodingProviderEDataType = createEDataType(IENCODING_PROVIDER);
		complianceLevelEDataType = createEDataType(COMPLIANCE_LEVEL);
		iPotentialProblemsAdvisorEDataType = createEDataType(IPOTENTIAL_PROBLEMS_ADVISOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getBuildResult() {
		return buildResultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getComplianceLevel() {
		return complianceLevelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDetailedDiagnosticData() {
		return detailedDiagnosticDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDetailedDiagnosticData_Issue() {
		return (EAttribute) detailedDiagnosticDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDetailedDiagnosticData_IssueData() {
		return (EAttribute) detailedDiagnosticDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDetailedDiagnosticData_Length() {
		return (EAttribute) detailedDiagnosticDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDetailedDiagnosticData_Offset() {
		return (EAttribute) detailedDiagnosticDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDiagnosticData() {
		return diagnosticDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagnosticData_File() {
		return (EAttribute) diagnosticDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagnosticData_LineNumber() {
		return (EAttribute) diagnosticDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDiagnosticData_Node() {
		return (EAttribute) diagnosticDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFileArray() {
		return fileArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getFileType() {
		return fileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getGraphHrefType() {
		return graphHrefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIEncodingProvider() {
		return iEncodingProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIPotentialProblemsAdvisor() {
		return iPotentialProblemsAdvisorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModuleDependencyGraphOptions() {
		return moduleDependencyGraphOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModuleDependencyGraphOptions_DotStream() {
		return (EAttribute) moduleDependencyGraphOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModuleDependencyGraphOptions_GraphHrefPrefix() {
		return (EAttribute) moduleDependencyGraphOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModuleDependencyGraphOptions_GraphHrefType() {
		return (EAttribute) moduleDependencyGraphOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModuleDependencyGraphOptions_ModulesToGraph() {
		return (EAttribute) moduleDependencyGraphOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getModuleDependencyGraphOptions_Title() {
		return (EAttribute) moduleDependencyGraphOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getOutputStream() {
		return outputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getStringArray() {
		return stringArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getThrowable() {
		return throwableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationFactory getValidationFactory() {
		return (ValidationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValidationOptions() {
		return validationOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_CheckLayout() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_CheckModuleSemantics() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_CheckReferences() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_ComplianceLevel() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValidationOptions_DependencyGraphOptions() {
		return (EReference) validationOptionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_EncodingProvider() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_Environment() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_FileType() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_PlatformURI() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_ProblemsAdvisor() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getValidationOptions_SearchPath() {
		return (EAttribute) validationOptionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValidationService() {
		return validationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getValidationServiceDiagnosticCode() {
		return validationServiceDiagnosticCodeEEnum;
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if(isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		detailedDiagnosticDataEClass.getESuperTypes().add(this.getDiagnosticData());

		// Initialize classes and features; add operations and parameters
		initEClass(
			validationServiceEClass, ValidationService.class, "ValidationService", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(
			validationServiceEClass, ecorePackage.getEResource(), "validateManifest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "code", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(validationServiceEClass, null, "validateManifest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "sourceFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			validationServiceEClass, this.getBuildResult(), "validateModule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "moduleDirectory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			validationServiceEClass, this.getBuildResult(), "validateRepository", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "catalogRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(validationServiceEClass, null, "validateRepository", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "catalogRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "factorData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "siteFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nodeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(
			validationServiceEClass, ecorePackage.getEResource(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "code", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(validationServiceEClass, this.getBuildResult(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFile(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getValidationOptions(), "options", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFileArray(), "examinedFiles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(validationServiceEClass, null, "produceSVG", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInputStream(), "dotStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "svgStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "compress", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(
			diagnosticDataEClass, DiagnosticData.class, "DiagnosticData", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getDiagnosticData_File(), this.getFile(), "file", null, 0, 1, DiagnosticData.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDiagnosticData_LineNumber(), ecorePackage.getEIntegerObject(), "lineNumber", "-1", 0, 1,
			DiagnosticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDiagnosticData_Node(), ecorePackage.getEString(), "node", null, 0, 1, DiagnosticData.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			detailedDiagnosticDataEClass, DetailedDiagnosticData.class, "DetailedDiagnosticData", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getDetailedDiagnosticData_Offset(), ecorePackage.getEIntegerObject(), "offset", null, 1, 1,
			DetailedDiagnosticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDetailedDiagnosticData_Length(), ecorePackage.getEIntegerObject(), "length", null, 1, 1,
			DetailedDiagnosticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDetailedDiagnosticData_Issue(), ecorePackage.getEString(), "issue", null, 1, 1,
			DetailedDiagnosticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDetailedDiagnosticData_IssueData(), this.getStringArray(), "issueData", null, 0, 1,
			DetailedDiagnosticData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			validationOptionsEClass, ValidationOptions.class, "ValidationOptions", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getValidationOptions_FileType(), this.getFileType(), "fileType", null, 1, 1, ValidationOptions.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_CheckLayout(), ecorePackage.getEBoolean(), "checkLayout", null, 1, 1,
			ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_CheckModuleSemantics(), ecorePackage.getEBoolean(), "checkModuleSemantics", null, 1,
			1, ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_CheckReferences(), ecorePackage.getEBoolean(), "checkReferences", null, 1, 1,
			ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_PlatformURI(), this.getURI(), "platformURI", null, 0, 1, ValidationOptions.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValidationOptions_DependencyGraphOptions(), this.getModuleDependencyGraphOptions(), null,
			"dependencyGraphOptions", null, 0, 1, ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_EncodingProvider(), this.getIEncodingProvider(), "encodingProvider", null, 0, 1,
			ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_Environment(), ecorePackage.getEString(), "environment", null, 0, 1,
			ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_SearchPath(), ecorePackage.getEString(), "searchPath", null, 0, 1,
			ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_ComplianceLevel(), this.getComplianceLevel(), "complianceLevel", null, 0, 1,
			ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getValidationOptions_ProblemsAdvisor(), this.getIPotentialProblemsAdvisor(), "problemsAdvisor", null, 0, 1,
			ValidationOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			moduleDependencyGraphOptionsEClass, ModuleDependencyGraphOptions.class, "ModuleDependencyGraphOptions",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getModuleDependencyGraphOptions_DotStream(), this.getOutputStream(), "dotStream", null, 1, 1,
			ModuleDependencyGraphOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getModuleDependencyGraphOptions_Title(), ecorePackage.getEString(), "title", null, 0, 1,
			ModuleDependencyGraphOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getModuleDependencyGraphOptions_ModulesToGraph(), this.getFileArray(), "modulesToGraph", null, 0, 1,
			ModuleDependencyGraphOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getModuleDependencyGraphOptions_GraphHrefType(), this.getGraphHrefType(), "graphHrefType", null, 0, 1,
			ModuleDependencyGraphOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getModuleDependencyGraphOptions_GraphHrefPrefix(), ecorePackage.getEString(), "graphHrefPrefix", null, 0,
			1, ModuleDependencyGraphOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(
			validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.class,
			"ValidationServiceDiagnosticCode");
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.GEPPETTO);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.GEPPETTO_SYNTAX);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.CATALOG_PARSER);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.CATALOG);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.FORGE);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.UNKNOWN);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.INTERNAL_ERROR);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.RUBY_SYNTAX);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.RUBY);
		addEEnumLiteral(validationServiceDiagnosticCodeEEnum, ValidationServiceDiagnosticCode.PUPPET_LINT);

		initEEnum(fileTypeEEnum, FileType.class, "FileType");
		addEEnumLiteral(fileTypeEEnum, FileType.DETECT);
		addEEnumLiteral(fileTypeEEnum, FileType.PUPPET_ROOT);
		addEEnumLiteral(fileTypeEEnum, FileType.MODULE_ROOT);
		addEEnumLiteral(fileTypeEEnum, FileType.SINGLE_SOURCE_FILE);

		initEEnum(graphHrefTypeEEnum, GraphHrefType.class, "GraphHrefType");
		addEEnumLiteral(graphHrefTypeEEnum, GraphHrefType.JS);
		addEEnumLiteral(graphHrefTypeEEnum, GraphHrefType.GITHUB);
		addEEnumLiteral(graphHrefTypeEEnum, GraphHrefType.RELATIVE_FILE);
		addEEnumLiteral(graphHrefTypeEEnum, GraphHrefType.ABSOLUTE_FILE);
		addEEnumLiteral(graphHrefTypeEEnum, GraphHrefType.NONE);

		// Initialize data types
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(throwableEDataType, Throwable.class, "Throwable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileArrayEDataType, File[].class, "FileArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", !IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			buildResultEDataType, BuildResult.class, "BuildResult", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			uriEDataType, org.eclipse.emf.common.util.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			outputStreamEDataType, OutputStream.class, "OutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			iEncodingProviderEDataType, IEncodingProvider.class, "IEncodingProvider", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			complianceLevelEDataType, ComplianceLevel.class, "ComplianceLevel", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			iPotentialProblemsAdvisorEDataType, IPotentialProblemsAdvisor.class, "IPotentialProblemsAdvisor",
			IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ValidationPackageImpl
