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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.cloudsmith.hammer.puppet.validation.FileType;
import com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions;
import com.cloudsmith.hammer.puppet.validation.ValidationOptions;
import com.cloudsmith.hammer.puppet.validation.ValidationPackage;
import com.cloudsmith.hammer.puppet.validation.runner.IEncodingProvider;
import org.cloudsmith.geppetto.pp.dsl.validation.IPotentialProblemsAdvisor;
import org.cloudsmith.geppetto.pp.dsl.validation.IValidationAdvisor.ComplianceLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getFileType <em>File Type</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#isCheckLayout <em>Check Layout</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#isCheckModuleSemantics <em>Check Module
 * Semantics</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#isCheckReferences <em>Check References</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getPlatformURI <em>Platform URI</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getDependencyGraphOptions <em>Dependency Graph
 * Options</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getEncodingProvider <em>Encoding Provider</em>}
 * </li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getEnvironment <em>Environment</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getSearchPath <em>Search Path</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getComplianceLevel <em>Compliance Level</em>}
 * </li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.ValidationOptionsImpl#getProblemsAdvisor <em>Problems Advisor</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValidationOptionsImpl extends EObjectImpl implements ValidationOptions {
	/**
	 * The default value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected static final FileType FILE_TYPE_EDEFAULT = FileType.DETECT;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected FileType fileType = FILE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckLayout() <em>Check Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isCheckLayout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_LAYOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckLayout() <em>Check Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isCheckLayout()
	 * @generated
	 * @ordered
	 */
	protected boolean checkLayout = CHECK_LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckModuleSemantics() <em>Check Module Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isCheckModuleSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_MODULE_SEMANTICS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckModuleSemantics() <em>Check Module Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isCheckModuleSemantics()
	 * @generated
	 * @ordered
	 */
	protected boolean checkModuleSemantics = CHECK_MODULE_SEMANTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckReferences() <em>Check References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isCheckReferences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_REFERENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckReferences() <em>Check References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isCheckReferences()
	 * @generated
	 * @ordered
	 */
	protected boolean checkReferences = CHECK_REFERENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformURI() <em>Platform URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPlatformURI()
	 * @generated
	 * @ordered
	 */
	protected static final URI PLATFORM_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformURI() <em>Platform URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPlatformURI()
	 * @generated
	 * @ordered
	 */
	protected URI platformURI = PLATFORM_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencyGraphOptions() <em>Dependency Graph Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDependencyGraphOptions()
	 * @generated
	 * @ordered
	 */
	protected ModuleDependencyGraphOptions dependencyGraphOptions;

	/**
	 * The default value of the '{@link #getEncodingProvider() <em>Encoding Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEncodingProvider()
	 * @generated
	 * @ordered
	 */
	protected static final IEncodingProvider ENCODING_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodingProvider() <em>Encoding Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEncodingProvider()
	 * @generated
	 * @ordered
	 */
	protected IEncodingProvider encodingProvider = ENCODING_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVIRONMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected String environment = ENVIRONMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchPath() <em>Search Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSearchPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchPath() <em>Search Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSearchPath()
	 * @generated
	 * @ordered
	 */
	protected String searchPath = SEARCH_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplianceLevel() <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComplianceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ComplianceLevel COMPLIANCE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplianceLevel() <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComplianceLevel()
	 * @generated
	 * @ordered
	 */
	protected ComplianceLevel complianceLevel = COMPLIANCE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProblemsAdvisor() <em>Problems Advisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProblemsAdvisor()
	 * @generated
	 * @ordered
	 */
	protected static final IPotentialProblemsAdvisor PROBLEMS_ADVISOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblemsAdvisor() <em>Problems Advisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getProblemsAdvisor()
	 * @generated
	 * @ordered
	 */
	protected IPotentialProblemsAdvisor problemsAdvisor = PROBLEMS_ADVISOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValidationOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDependencyGraphOptions(ModuleDependencyGraphOptions newDependencyGraphOptions,
			NotificationChain msgs) {
		ModuleDependencyGraphOptions oldDependencyGraphOptions = dependencyGraphOptions;
		dependencyGraphOptions = newDependencyGraphOptions;
		if(eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS,
				oldDependencyGraphOptions, newDependencyGraphOptions);
			if(msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
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
			case ValidationPackage.VALIDATION_OPTIONS__FILE_TYPE:
				return getFileType();
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_LAYOUT:
				return isCheckLayout();
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS:
				return isCheckModuleSemantics();
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_REFERENCES:
				return isCheckReferences();
			case ValidationPackage.VALIDATION_OPTIONS__PLATFORM_URI:
				return getPlatformURI();
			case ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS:
				return getDependencyGraphOptions();
			case ValidationPackage.VALIDATION_OPTIONS__ENCODING_PROVIDER:
				return getEncodingProvider();
			case ValidationPackage.VALIDATION_OPTIONS__ENVIRONMENT:
				return getEnvironment();
			case ValidationPackage.VALIDATION_OPTIONS__SEARCH_PATH:
				return getSearchPath();
			case ValidationPackage.VALIDATION_OPTIONS__COMPLIANCE_LEVEL:
				return getComplianceLevel();
			case ValidationPackage.VALIDATION_OPTIONS__PROBLEMS_ADVISOR:
				return getProblemsAdvisor();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch(featureID) {
			case ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS:
				return basicSetDependencyGraphOptions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ValidationPackage.VALIDATION_OPTIONS__FILE_TYPE:
				return fileType != FILE_TYPE_EDEFAULT;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_LAYOUT:
				return checkLayout != CHECK_LAYOUT_EDEFAULT;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS:
				return checkModuleSemantics != CHECK_MODULE_SEMANTICS_EDEFAULT;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_REFERENCES:
				return checkReferences != CHECK_REFERENCES_EDEFAULT;
			case ValidationPackage.VALIDATION_OPTIONS__PLATFORM_URI:
				return PLATFORM_URI_EDEFAULT == null
						? platformURI != null
						: !PLATFORM_URI_EDEFAULT.equals(platformURI);
			case ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS:
				return dependencyGraphOptions != null;
			case ValidationPackage.VALIDATION_OPTIONS__ENCODING_PROVIDER:
				return ENCODING_PROVIDER_EDEFAULT == null
						? encodingProvider != null
						: !ENCODING_PROVIDER_EDEFAULT.equals(encodingProvider);
			case ValidationPackage.VALIDATION_OPTIONS__ENVIRONMENT:
				return ENVIRONMENT_EDEFAULT == null
						? environment != null
						: !ENVIRONMENT_EDEFAULT.equals(environment);
			case ValidationPackage.VALIDATION_OPTIONS__SEARCH_PATH:
				return SEARCH_PATH_EDEFAULT == null
						? searchPath != null
						: !SEARCH_PATH_EDEFAULT.equals(searchPath);
			case ValidationPackage.VALIDATION_OPTIONS__COMPLIANCE_LEVEL:
				return COMPLIANCE_LEVEL_EDEFAULT == null
						? complianceLevel != null
						: !COMPLIANCE_LEVEL_EDEFAULT.equals(complianceLevel);
			case ValidationPackage.VALIDATION_OPTIONS__PROBLEMS_ADVISOR:
				return PROBLEMS_ADVISOR_EDEFAULT == null
						? problemsAdvisor != null
						: !PROBLEMS_ADVISOR_EDEFAULT.equals(problemsAdvisor);
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
			case ValidationPackage.VALIDATION_OPTIONS__FILE_TYPE:
				setFileType((FileType) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_LAYOUT:
				setCheckLayout((Boolean) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS:
				setCheckModuleSemantics((Boolean) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_REFERENCES:
				setCheckReferences((Boolean) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__PLATFORM_URI:
				setPlatformURI((URI) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS:
				setDependencyGraphOptions((ModuleDependencyGraphOptions) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__ENCODING_PROVIDER:
				setEncodingProvider((IEncodingProvider) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__ENVIRONMENT:
				setEnvironment((String) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__SEARCH_PATH:
				setSearchPath((String) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__COMPLIANCE_LEVEL:
				setComplianceLevel((ComplianceLevel) newValue);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__PROBLEMS_ADVISOR:
				setProblemsAdvisor((IPotentialProblemsAdvisor) newValue);
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
		return ValidationPackage.Literals.VALIDATION_OPTIONS;
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
			case ValidationPackage.VALIDATION_OPTIONS__FILE_TYPE:
				setFileType(FILE_TYPE_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_LAYOUT:
				setCheckLayout(CHECK_LAYOUT_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS:
				setCheckModuleSemantics(CHECK_MODULE_SEMANTICS_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__CHECK_REFERENCES:
				setCheckReferences(CHECK_REFERENCES_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__PLATFORM_URI:
				setPlatformURI(PLATFORM_URI_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS:
				setDependencyGraphOptions((ModuleDependencyGraphOptions) null);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__ENCODING_PROVIDER:
				setEncodingProvider(ENCODING_PROVIDER_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__SEARCH_PATH:
				setSearchPath(SEARCH_PATH_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__COMPLIANCE_LEVEL:
				setComplianceLevel(COMPLIANCE_LEVEL_EDEFAULT);
				return;
			case ValidationPackage.VALIDATION_OPTIONS__PROBLEMS_ADVISOR:
				setProblemsAdvisor(PROBLEMS_ADVISOR_EDEFAULT);
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
	public ComplianceLevel getComplianceLevel() {
		return complianceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModuleDependencyGraphOptions getDependencyGraphOptions() {
		return dependencyGraphOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IEncodingProvider getEncodingProvider() {
		return encodingProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FileType getFileType() {
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URI getPlatformURI() {
		return platformURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IPotentialProblemsAdvisor getProblemsAdvisor() {
		return problemsAdvisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSearchPath() {
		return searchPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isCheckLayout() {
		return checkLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isCheckModuleSemantics() {
		return checkModuleSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isCheckReferences() {
		return checkReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCheckLayout(boolean newCheckLayout) {
		boolean oldCheckLayout = checkLayout;
		checkLayout = newCheckLayout;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__CHECK_LAYOUT, oldCheckLayout, checkLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCheckModuleSemantics(boolean newCheckModuleSemantics) {
		boolean oldCheckModuleSemantics = checkModuleSemantics;
		checkModuleSemantics = newCheckModuleSemantics;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__CHECK_MODULE_SEMANTICS,
				oldCheckModuleSemantics, checkModuleSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCheckReferences(boolean newCheckReferences) {
		boolean oldCheckReferences = checkReferences;
		checkReferences = newCheckReferences;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__CHECK_REFERENCES, oldCheckReferences,
				checkReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setComplianceLevel(ComplianceLevel newComplianceLevel) {
		ComplianceLevel oldComplianceLevel = complianceLevel;
		complianceLevel = newComplianceLevel;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__COMPLIANCE_LEVEL, oldComplianceLevel,
				complianceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDependencyGraphOptions(ModuleDependencyGraphOptions newDependencyGraphOptions) {
		if(newDependencyGraphOptions != dependencyGraphOptions) {
			NotificationChain msgs = null;
			if(dependencyGraphOptions != null)
				msgs = ((InternalEObject) dependencyGraphOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS, null, msgs);
			if(newDependencyGraphOptions != null)
				msgs = ((InternalEObject) newDependencyGraphOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS, null, msgs);
			msgs = basicSetDependencyGraphOptions(newDependencyGraphOptions, msgs);
			if(msgs != null)
				msgs.dispatch();
		}
		else if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__DEPENDENCY_GRAPH_OPTIONS,
				newDependencyGraphOptions, newDependencyGraphOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEncodingProvider(IEncodingProvider newEncodingProvider) {
		IEncodingProvider oldEncodingProvider = encodingProvider;
		encodingProvider = newEncodingProvider;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__ENCODING_PROVIDER, oldEncodingProvider,
				encodingProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnvironment(String newEnvironment) {
		String oldEnvironment = environment;
		environment = newEnvironment;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFileType(FileType newFileType) {
		FileType oldFileType = fileType;
		fileType = newFileType == null
				? FILE_TYPE_EDEFAULT
				: newFileType;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__FILE_TYPE, oldFileType, fileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPlatformURI(URI newPlatformURI) {
		URI oldPlatformURI = platformURI;
		platformURI = newPlatformURI;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__PLATFORM_URI, oldPlatformURI, platformURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProblemsAdvisor(IPotentialProblemsAdvisor newProblemsAdvisor) {
		IPotentialProblemsAdvisor oldProblemsAdvisor = problemsAdvisor;
		problemsAdvisor = newProblemsAdvisor;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__PROBLEMS_ADVISOR, oldProblemsAdvisor,
				problemsAdvisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSearchPath(String newSearchPath) {
		String oldSearchPath = searchPath;
		searchPath = newSearchPath;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.VALIDATION_OPTIONS__SEARCH_PATH, oldSearchPath, searchPath));
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
		result.append(" (fileType: ");
		result.append(fileType);
		result.append(", checkLayout: ");
		result.append(checkLayout);
		result.append(", checkModuleSemantics: ");
		result.append(checkModuleSemantics);
		result.append(", checkReferences: ");
		result.append(checkReferences);
		result.append(", platformURI: ");
		result.append(platformURI);
		result.append(", encodingProvider: ");
		result.append(encodingProvider);
		result.append(", environment: ");
		result.append(environment);
		result.append(", searchPath: ");
		result.append(searchPath);
		result.append(", complianceLevel: ");
		result.append(complianceLevel);
		result.append(", problemsAdvisor: ");
		result.append(problemsAdvisor);
		result.append(')');
		return result.toString();
	}

} // ValidationOptionsImpl
