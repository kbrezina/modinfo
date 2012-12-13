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
package com.cloudsmith.hammer.puppet.validation.util;

import com.cloudsmith.hammer.puppet.validation.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData;
import com.cloudsmith.hammer.puppet.validation.DiagnosticData;
import com.cloudsmith.hammer.puppet.validation.ValidationPackage;
import com.cloudsmith.hammer.puppet.validation.ValidationService;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage
 * @generated
 */
public class ValidationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ValidationPackage modelPackage;

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValidationSwitch<Adapter> modelSwitch = new ValidationSwitch<Adapter>() {
		@Override
		public Adapter caseDetailedDiagnosticData(DetailedDiagnosticData object) {
			return createDetailedDiagnosticDataAdapter();
		}

		@Override
		public Adapter caseDiagnosticData(DiagnosticData object) {
			return createDiagnosticDataAdapter();
		}

		@Override
		public Adapter caseModuleDependencyGraphOptions(ModuleDependencyGraphOptions object) {
			return createModuleDependencyGraphOptionsAdapter();
		}

		@Override
		public Adapter caseValidationOptions(ValidationOptions object) {
			return createValidationOptionsAdapter();
		}

		@Override
		public Adapter caseValidationService(ValidationService object) {
			return createValidationServiceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationAdapterFactory() {
		if(modelPackage == null) {
			modelPackage = ValidationPackage.eINSTANCE;
		}
	}

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData
	 * <em>Detailed Diagnostic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.hammer.puppet.validation.DetailedDiagnosticData
	 * @generated
	 */
	public Adapter createDetailedDiagnosticDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.hammer.puppet.validation.DiagnosticData <em>Diagnostic
	 * Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.hammer.puppet.validation.DiagnosticData
	 * @generated
	 */
	public Adapter createDiagnosticDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions
	 * <em>Module Dependency Graph Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.hammer.puppet.validation.ModuleDependencyGraphOptions
	 * @generated
	 */
	public Adapter createModuleDependencyGraphOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.hammer.puppet.validation.ValidationOptions
	 * <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationOptions
	 * @generated
	 */
	public Adapter createValidationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.cloudsmith.hammer.puppet.validation.ValidationService
	 * <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.cloudsmith.hammer.puppet.validation.ValidationService
	 * @generated
	 */
	public Adapter createValidationServiceAdapter() {
		return null;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the
	 * model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if(object == modelPackage) {
			return true;
		}
		if(object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

} // ValidationAdapterFactory
