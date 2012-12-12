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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor;
import org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValidationFactoryImpl extends EFactoryImpl implements ValidationFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValidationPackage getPackage() {
		return ValidationPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ValidationFactory init() {

		try {
			ValidationFactory theValidationFactory = (ValidationFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.cloudsmith.com/hammer/1.0.0/Puppet/Validation");
			if(theValidationFactory != null) {
				return theValidationFactory;
			}
		}
		catch(Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValidationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertBuildResultToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertComplianceLevelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFileArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertGraphHrefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIEncodingProviderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIPotentialProblemsAdvisorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertStringArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch(eDataType.getClassifierID()) {
			case ValidationPackage.VALIDATION_SERVICE_DIAGNOSTIC_CODE:
				return convertValidationServiceDiagnosticCodeToString(eDataType, instanceValue);
			case ValidationPackage.FILE_TYPE:
				return convertFileTypeToString(eDataType, instanceValue);
			case ValidationPackage.GRAPH_HREF_TYPE:
				return convertGraphHrefTypeToString(eDataType, instanceValue);
			case ValidationPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			case ValidationPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			case ValidationPackage.STRING_ARRAY:
				return convertStringArrayToString(eDataType, instanceValue);
			case ValidationPackage.FILE_ARRAY:
				return convertFileArrayToString(eDataType, instanceValue);
			case ValidationPackage.BUILD_RESULT:
				return convertBuildResultToString(eDataType, instanceValue);
			case ValidationPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case ValidationPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case ValidationPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case ValidationPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case ValidationPackage.IENCODING_PROVIDER:
				return convertIEncodingProviderToString(eDataType, instanceValue);
			case ValidationPackage.COMPLIANCE_LEVEL:
				return convertComplianceLevelToString(eDataType, instanceValue);
			case ValidationPackage.IPOTENTIAL_PROBLEMS_ADVISOR:
				return convertIPotentialProblemsAdvisorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertValidationServiceDiagnosticCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch(eClass.getClassifierID()) {
			case ValidationPackage.VALIDATION_SERVICE:
				return createValidationService();
			case ValidationPackage.DIAGNOSTIC_DATA:
				return createDiagnosticData();
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA:
				return createDetailedDiagnosticData();
			case ValidationPackage.VALIDATION_OPTIONS:
				return createValidationOptions();
			case ValidationPackage.MODULE_DEPENDENCY_GRAPH_OPTIONS:
				return createModuleDependencyGraphOptions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BuildResult createBuildResultFromString(EDataType eDataType, String initialValue) {
		return (BuildResult) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComplianceLevel createComplianceLevelFromString(EDataType eDataType, String initialValue) {
		return (ComplianceLevel) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DetailedDiagnosticData createDetailedDiagnosticData() {
		DetailedDiagnosticDataImpl detailedDiagnosticData = new DetailedDiagnosticDataImpl();
		return detailedDiagnosticData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiagnosticData createDiagnosticData() {
		DiagnosticDataImpl diagnosticData = new DiagnosticDataImpl();
		return diagnosticData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public File[] createFileArrayFromString(EDataType eDataType, String initialValue) {
		return (File[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FileType createFileTypeFromString(EDataType eDataType, String initialValue) {
		FileType result = FileType.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch(eDataType.getClassifierID()) {
			case ValidationPackage.VALIDATION_SERVICE_DIAGNOSTIC_CODE:
				return createValidationServiceDiagnosticCodeFromString(eDataType, initialValue);
			case ValidationPackage.FILE_TYPE:
				return createFileTypeFromString(eDataType, initialValue);
			case ValidationPackage.GRAPH_HREF_TYPE:
				return createGraphHrefTypeFromString(eDataType, initialValue);
			case ValidationPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			case ValidationPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			case ValidationPackage.STRING_ARRAY:
				return createStringArrayFromString(eDataType, initialValue);
			case ValidationPackage.FILE_ARRAY:
				return createFileArrayFromString(eDataType, initialValue);
			case ValidationPackage.BUILD_RESULT:
				return createBuildResultFromString(eDataType, initialValue);
			case ValidationPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case ValidationPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case ValidationPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case ValidationPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case ValidationPackage.IENCODING_PROVIDER:
				return createIEncodingProviderFromString(eDataType, initialValue);
			case ValidationPackage.COMPLIANCE_LEVEL:
				return createComplianceLevelFromString(eDataType, initialValue);
			case ValidationPackage.IPOTENTIAL_PROBLEMS_ADVISOR:
				return createIPotentialProblemsAdvisorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphHrefType createGraphHrefTypeFromString(EDataType eDataType, String initialValue) {
		GraphHrefType result = GraphHrefType.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IEncodingProvider createIEncodingProviderFromString(EDataType eDataType, String initialValue) {
		return (IEncodingProvider) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IPotentialProblemsAdvisor createIPotentialProblemsAdvisorFromString(EDataType eDataType, String initialValue) {
		return (IPotentialProblemsAdvisor) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleDependencyGraphOptions createModuleDependencyGraphOptions() {
		ModuleDependencyGraphOptionsImpl moduleDependencyGraphOptions = new ModuleDependencyGraphOptionsImpl();
		return moduleDependencyGraphOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutputStream createOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[] createStringArrayFromString(EDataType eDataType, String initialValue) {
		return (String[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Throwable createThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationOptions createValidationOptions() {
		ValidationOptionsImpl validationOptions = new ValidationOptionsImpl();
		return validationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationService createValidationService() {
		ValidationServiceImpl validationService = new ValidationServiceImpl();
		return validationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationServiceDiagnosticCode createValidationServiceDiagnosticCodeFromString(EDataType eDataType,
			String initialValue) {
		ValidationServiceDiagnosticCode result = ValidationServiceDiagnosticCode.get(initialValue);
		if(result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationPackage getValidationPackage() {
		return (ValidationPackage) getEPackage();
	}

} // ValidationFactoryImpl
