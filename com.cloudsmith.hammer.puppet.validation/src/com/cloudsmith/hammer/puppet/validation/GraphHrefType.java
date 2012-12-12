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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Graph Href Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getGraphHrefType()
 * @model
 * @generated
 */
public enum GraphHrefType implements Enumerator {
	/**
	 * The '<em><b>JS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #JS_VALUE
	 * @generated
	 * @ordered
	 */
	JS(0, "JS", "JS"),

	/**
	 * The '<em><b>Github</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #GITHUB_VALUE
	 * @generated
	 * @ordered
	 */
	GITHUB(1, "Github", "Github"),

	/**
	 * The '<em><b>Relative File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #RELATIVE_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_FILE(2, "RelativeFile", "RelativeFile"),

	/**
	 * The '<em><b>Absolute File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ABSOLUTE_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	ABSOLUTE_FILE(3, "AbsoluteFile", "AbsoluteFile"), /**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(4, "None", "None");

	/**
	 * The '<em><b>JS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JS</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #JS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JS_VALUE = 0;

	/**
	 * The '<em><b>Github</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Github</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #GITHUB
	 * @model name="Github"
	 * @generated
	 * @ordered
	 */
	public static final int GITHUB_VALUE = 1;

	/**
	 * The '<em><b>Relative File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relative File</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #RELATIVE_FILE
	 * @model name="RelativeFile"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_FILE_VALUE = 2;

	/**
	 * The '<em><b>Absolute File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Absolute File</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ABSOLUTE_FILE
	 * @model name="AbsoluteFile"
	 * @generated
	 * @ordered
	 */
	public static final int ABSOLUTE_FILE_VALUE = 3;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Graph Href Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final GraphHrefType[] VALUES_ARRAY = new GraphHrefType[] {
			JS, GITHUB, RELATIVE_FILE, ABSOLUTE_FILE, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Graph Href Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<GraphHrefType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Graph Href Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GraphHrefType get(int value) {
		switch(value) {
			case JS_VALUE:
				return JS;
			case GITHUB_VALUE:
				return GITHUB;
			case RELATIVE_FILE_VALUE:
				return RELATIVE_FILE;
			case ABSOLUTE_FILE_VALUE:
				return ABSOLUTE_FILE;
			case NONE_VALUE:
				return NONE;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Href Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GraphHrefType get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphHrefType result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Href Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GraphHrefType getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphHrefType result = VALUES_ARRAY[i];
			if(result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private GraphHrefType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // GraphHrefType
