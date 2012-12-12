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
 * A representation of the literals of the enumeration '<em><b>File Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getFileType()
 * @model
 * @generated
 */
public enum FileType implements Enumerator {
	/**
	 * The '<em><b>DETECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DETECT_VALUE
	 * @generated
	 * @ordered
	 */
	DETECT(0, "DETECT", "DETECT"),

	/**
	 * The '<em><b>PUPPET ROOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #PUPPET_ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	PUPPET_ROOT(1, "PUPPET_ROOT", "PUPPET_ROOT"),

	/**
	 * The '<em><b>MODULE ROOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #MODULE_ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	MODULE_ROOT(2, "MODULE_ROOT", "MODULE_ROOT"),

	/**
	 * The '<em><b>SINGLE SOURCE FILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SINGLE_SOURCE_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_SOURCE_FILE(3, "SINGLE_SOURCE_FILE", "SINGLE_SOURCE_FILE");

	/**
	 * The '<em><b>DETECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detect if file is a single source file, or a directory, and if this directory has a "modules" subdirectory in it, interpret
	 * this director as
	 * being a PUPPET_ROOT, else a MODULE_ROOT.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #DETECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETECT_VALUE = 0;

	/**
	 * The '<em><b>PUPPET ROOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The file must be a directory, and its modules are expected to be found in a "modules" subdirectory. Manifests are expected
	 * to be in a "manifests" directory, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @see #PUPPET_ROOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUPPET_ROOT_VALUE = 1;

	/**
	 * The '<em><b>MODULE ROOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expects the file to be a directory, and that it complies with a module's layout. It is not expected that there is a
	 * subdirectory called "modules".
	 * <!-- end-model-doc -->
	 * 
	 * @see #MODULE_ROOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULE_ROOT_VALUE = 2;

	/**
	 * The '<em><b>SINGLE SOURCE FILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The file should be a single source file or type ".pp", ".rb" or "Modulefile".
	 * <!-- end-model-doc -->
	 * 
	 * @see #SINGLE_SOURCE_FILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_SOURCE_FILE_VALUE = 3;

	/**
	 * An array of all the '<em><b>File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final FileType[] VALUES_ARRAY = new FileType[] {
			DETECT, PUPPET_ROOT, MODULE_ROOT, SINGLE_SOURCE_FILE, };

	/**
	 * A public read-only list of all the '<em><b>File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<FileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FileType get(int value) {
		switch(value) {
			case DETECT_VALUE:
				return DETECT;
			case PUPPET_ROOT_VALUE:
				return PUPPET_ROOT;
			case MODULE_ROOT_VALUE:
				return MODULE_ROOT;
			case SINGLE_SOURCE_FILE_VALUE:
				return SINGLE_SOURCE_FILE;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FileType get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileType result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static FileType getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileType result = VALUES_ARRAY[i];
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
	private FileType(int value, String name, String literal) {
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

} // FileType
