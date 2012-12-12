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
import com.cloudsmith.hammer.puppet.validation.ValidationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detailed Diagnostic Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl#getOffset <em>Offset</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl#getLength <em>Length</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl#getIssue <em>Issue</em>}</li>
 * <li>{@link com.cloudsmith.hammer.puppet.validation.impl.DetailedDiagnosticDataImpl#getIssueData <em>Issue Data</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DetailedDiagnosticDataImpl extends DiagnosticDataImpl implements DetailedDiagnosticData {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Integer length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected String issue = ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueData() <em>Issue Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIssueData()
	 * @generated
	 * @ordered
	 */
	protected static final String[] ISSUE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueData() <em>Issue Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIssueData()
	 * @generated
	 * @ordered
	 */
	protected String[] issueData = ISSUE_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DetailedDiagnosticDataImpl() {
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
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__OFFSET:
				return getOffset();
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__LENGTH:
				return getLength();
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE:
				return getIssue();
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA:
				return getIssueData();
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
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__OFFSET:
				return OFFSET_EDEFAULT == null
						? offset != null
						: !OFFSET_EDEFAULT.equals(offset);
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__LENGTH:
				return LENGTH_EDEFAULT == null
						? length != null
						: !LENGTH_EDEFAULT.equals(length);
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE:
				return ISSUE_EDEFAULT == null
						? issue != null
						: !ISSUE_EDEFAULT.equals(issue);
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA:
				return ISSUE_DATA_EDEFAULT == null
						? issueData != null
						: !ISSUE_DATA_EDEFAULT.equals(issueData);
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
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__OFFSET:
				setOffset((Integer) newValue);
				return;
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__LENGTH:
				setLength((Integer) newValue);
				return;
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE:
				setIssue((String) newValue);
				return;
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA:
				setIssueData((String[]) newValue);
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
		return ValidationPackage.Literals.DETAILED_DIAGNOSTIC_DATA;
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
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA:
				setIssueData(ISSUE_DATA_EDEFAULT);
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
	public String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String[] getIssueData() {
		return issueData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIssueData(String[] newIssueData) {
		String[] oldIssueData = issueData;
		issueData = newIssueData;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DETAILED_DIAGNOSTIC_DATA__ISSUE_DATA, oldIssueData, issueData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLength(Integer newLength) {
		Integer oldLength = length;
		length = newLength;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DETAILED_DIAGNOSTIC_DATA__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOffset(Integer newOffset) {
		Integer oldOffset = offset;
		offset = newOffset;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DETAILED_DIAGNOSTIC_DATA__OFFSET, oldOffset, offset));
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
		result.append(" (offset: ");
		result.append(offset);
		result.append(", length: ");
		result.append(length);
		result.append(", issue: ");
		result.append(issue);
		result.append(", issueData: ");
		result.append(issueData);
		result.append(')');
		return result.toString();
	}

} // DetailedDiagnosticDataImpl
