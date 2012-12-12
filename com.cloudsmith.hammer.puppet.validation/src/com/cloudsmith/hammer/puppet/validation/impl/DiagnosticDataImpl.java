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

import com.cloudsmith.hammer.puppet.validation.DiagnosticData;
import com.cloudsmith.hammer.puppet.validation.ValidationPackage;

import java.io.File;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.DiagnosticDataImpl#getFile <em>File</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.DiagnosticDataImpl#getLineNumber <em>Line Number</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.DiagnosticDataImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DiagnosticDataImpl extends EObjectImpl implements DiagnosticData {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final File FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINE_NUMBER_EDEFAULT = new Integer(-1);

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiagnosticDataImpl() {
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
			case ValidationPackage.DIAGNOSTIC_DATA__FILE:
				return getFile();
			case ValidationPackage.DIAGNOSTIC_DATA__LINE_NUMBER:
				return getLineNumber();
			case ValidationPackage.DIAGNOSTIC_DATA__NODE:
				return getNode();
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
			case ValidationPackage.DIAGNOSTIC_DATA__FILE:
				return FILE_EDEFAULT == null
						? file != null
						: !FILE_EDEFAULT.equals(file);
			case ValidationPackage.DIAGNOSTIC_DATA__LINE_NUMBER:
				return LINE_NUMBER_EDEFAULT == null
						? lineNumber != null
						: !LINE_NUMBER_EDEFAULT.equals(lineNumber);
			case ValidationPackage.DIAGNOSTIC_DATA__NODE:
				return NODE_EDEFAULT == null
						? node != null
						: !NODE_EDEFAULT.equals(node);
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
			case ValidationPackage.DIAGNOSTIC_DATA__FILE:
				setFile((File) newValue);
				return;
			case ValidationPackage.DIAGNOSTIC_DATA__LINE_NUMBER:
				setLineNumber((Integer) newValue);
				return;
			case ValidationPackage.DIAGNOSTIC_DATA__NODE:
				setNode((String) newValue);
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
		return ValidationPackage.Literals.DIAGNOSTIC_DATA;
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
			case ValidationPackage.DIAGNOSTIC_DATA__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case ValidationPackage.DIAGNOSTIC_DATA__LINE_NUMBER:
				setLineNumber(LINE_NUMBER_EDEFAULT);
				return;
			case ValidationPackage.DIAGNOSTIC_DATA__NODE:
				setNode(NODE_EDEFAULT);
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
	public File getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getLineNumber() {
		return lineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC_DATA__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLineNumber(Integer newLineNumber) {
		Integer oldLineNumber = lineNumber;
		lineNumber = newLineNumber;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC_DATA__LINE_NUMBER, oldLineNumber, lineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC_DATA__NODE, oldNode, node));
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
		result.append(" (file: ");
		result.append(file);
		result.append(", lineNumber: ");
		result.append(lineNumber);
		result.append(", node: ");
		result.append(node);
		result.append(')');
		return result.toString();
	}

} // DiagnosticDataImpl
