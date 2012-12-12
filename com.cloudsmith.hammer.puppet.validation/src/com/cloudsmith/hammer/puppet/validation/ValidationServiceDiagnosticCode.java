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
 * A representation of the literals of the enumeration '<em><b>Service Diagnostic Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Describes the Diagnostic#code produced by diagnosticians under the control of the ValidationService. i.e. the codes found when
 * the DiagnosticSource is ValidationService.
 * <!-- end-model-doc -->
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationServiceDiagnosticCode()
 * @model
 * @generated
 */
public enum ValidationServiceDiagnosticCode implements Enumerator {
	/**
	 * The '<em><b>GEPPETTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #GEPPETTO_VALUE
	 * @generated
	 * @ordered
	 */
	GEPPETTO(1, "GEPPETTO", "GEPPETTO"),

	/**
	 * The '<em><b>GEPPETTO SYNTAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #GEPPETTO_SYNTAX_VALUE
	 * @generated
	 * @ordered
	 */
	GEPPETTO_SYNTAX(2, "GEPPETTO_SYNTAX", "GEPPETTO_SYNTAX"),

	/**
	 * The '<em><b>CATALOG PARSER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CATALOG_PARSER_VALUE
	 * @generated
	 * @ordered
	 */
	CATALOG_PARSER(3, "CATALOG_PARSER", "CATALOG_PARSER"),

	/**
	 * The '<em><b>CATALOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #CATALOG_VALUE
	 * @generated
	 * @ordered
	 */
	CATALOG(4, "CATALOG", "CATALOG"),

	/**
	 * The '<em><b>FORGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #FORGE_VALUE
	 * @generated
	 * @ordered
	 */
	FORGE(5, "FORGE", "FORGE"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>INTERNAL ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #INTERNAL_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_ERROR(6, "INTERNAL_ERROR", "INTERNAL_ERROR"), /**
	 * The '<em><b>RUBY SYNTAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #RUBY_SYNTAX_VALUE
	 * @generated
	 * @ordered
	 */
	RUBY_SYNTAX(7, "RUBY_SYNTAX", "RUBY_SYNTAX"), /**
	 * The '<em><b>RUBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #RUBY_VALUE
	 * @generated
	 * @ordered
	 */
	RUBY(8, "RUBY", "RUBY"), /**
	 * The '<em><b>PUPPET LINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #PUPPET_LINT_VALUE
	 * @generated
	 * @ordered
	 */
	PUPPET_LINT(9, "PUPPET_LINT", "PUPPET_LINT");

	/**
	 * The '<em><b>GEPPETTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general diagnostic emitted by geppetto (as oppose to the more specific GEPPETTO_SYNTAX).
	 * <!-- end-model-doc -->
	 * 
	 * @see #GEPPETTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEPPETTO_VALUE = 1;

	/**
	 * The '<em><b>GEPPETTO SYNTAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A syntax error found by Geppetto.
	 * <!-- end-model-doc -->
	 * 
	 * @see #GEPPETTO_SYNTAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEPPETTO_SYNTAX_VALUE = 2;

	/**
	 * The '<em><b>CATALOG PARSER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A diagnostic found by the catalog producer (running puppet), where the error was reported as "Could not parse....".
	 * <!-- end-model-doc -->
	 * 
	 * @see #CATALOG_PARSER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATALOG_PARSER_VALUE = 3;

	/**
	 * The '<em><b>CATALOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general diagnostic prouced by the catalog validator (runnning puppet).
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #CATALOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATALOG_VALUE = 4;

	/**
	 * The '<em><b>FORGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A diagnostic produced by the forge compliance/validator.
	 * <!-- end-model-doc -->
	 * 
	 * @see #FORGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORGE_VALUE = 5;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A problem of unknown origin - typically indicates an internal error where the code was not set.
	 * <!-- end-model-doc -->
	 * 
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>INTERNAL ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to report hard errors (typically) relating to the validation service itself or the environment where it runs.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #INTERNAL_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_ERROR_VALUE = 6;

	/**
	 * The '<em><b>RUBY SYNTAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RUBY SYNTAX</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #RUBY_SYNTAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUBY_SYNTAX_VALUE = 7;

	/**
	 * The '<em><b>RUBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RUBY</b></em>' literal object isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #RUBY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUBY_VALUE = 8;

	/**
	 * The '<em><b>PUPPET LINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to report issues generated by the puppet-lint program
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #PUPPET_LINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUPPET_LINT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Service Diagnostic Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ValidationServiceDiagnosticCode[] VALUES_ARRAY = new ValidationServiceDiagnosticCode[] {
			GEPPETTO, GEPPETTO_SYNTAX, CATALOG_PARSER, CATALOG, FORGE, UNKNOWN, INTERNAL_ERROR, RUBY_SYNTAX, RUBY,
			PUPPET_LINT, };

	/**
	 * A public read-only list of all the '<em><b>Service Diagnostic Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ValidationServiceDiagnosticCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Diagnostic Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ValidationServiceDiagnosticCode get(int value) {
		switch(value) {
			case GEPPETTO_VALUE:
				return GEPPETTO;
			case GEPPETTO_SYNTAX_VALUE:
				return GEPPETTO_SYNTAX;
			case CATALOG_PARSER_VALUE:
				return CATALOG_PARSER;
			case CATALOG_VALUE:
				return CATALOG;
			case FORGE_VALUE:
				return FORGE;
			case UNKNOWN_VALUE:
				return UNKNOWN;
			case INTERNAL_ERROR_VALUE:
				return INTERNAL_ERROR;
			case RUBY_SYNTAX_VALUE:
				return RUBY_SYNTAX;
			case RUBY_VALUE:
				return RUBY;
			case PUPPET_LINT_VALUE:
				return PUPPET_LINT;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Diagnostic Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ValidationServiceDiagnosticCode get(String literal) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidationServiceDiagnosticCode result = VALUES_ARRAY[i];
			if(result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Diagnostic Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ValidationServiceDiagnosticCode getByName(String name) {
		for(int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidationServiceDiagnosticCode result = VALUES_ARRAY[i];
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
	private ValidationServiceDiagnosticCode(int value, String name, String literal) {
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

} // ValidationServiceDiagnosticCode
