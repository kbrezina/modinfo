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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.cloudsmith.hammer.puppet.validation.runner.BuildResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see com.cloudsmith.hammer.puppet.validation.ValidationPackage#getValidationService()
 * @model
 * @generated
 */
public interface ValidationService extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Produces SVG output (compressed or regular) by reading the dotStream input (in dot format), piping this to graphviz dot
	 * layout engine producing SVG output that is written in compressed form to the svgStream.
	 * The compression is performed by this method, the caller should <b>not</b> provide a GZip stream.
	 * <!-- end-model-doc -->
	 * 
	 * @model exceptions="com.cloudsmith.hammer.puppet.validation.IOException"
	 *        dotStreamDataType="com.cloudsmith.hammer.puppet.validation.InputStream"
	 *        svgStreamDataType="com.cloudsmith.hammer.puppet.validation.OutputStream"
	 *        monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	void produceSVG(InputStream dotStream, OutputStream svgStream, boolean compress, IProgressMonitor monitor)
			throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Performs validation and reports diagnostics for all files given by source under the control of options. If a set of
	 * examinedFiles is given the diagnostics reported is limited to this set. An empty set is the same as reporting diagnostics
	 * for all files in source.
	 * 
	 * The options may be null, in which case a syntax check is performed on everything in the intersection of source and
	 * examinedFiles.
	 * 
	 * The examinedFiles may contain individual regular files or directories. Directories in examinedFiles are validated as
	 * modules. One special case is when examinedFiles contains the source and source is a Directory - this is interpreted as
	 * source is a PUPPET-ROOT, and that validation for everything in the non-modules part is wanted (and possibly for a select
	 * set of modules).
	 * 
	 * @param diagnostics DiagnosticChain will receive calls to add Diagnostic instances for discovered problems/information.
	 * @param source A String containing PP code to be validated. Errors are reported for a fictious file "unnamed.pp".
	 *        <!-- end-model-doc -->
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.BuildResult"
	 *        sourceDataType="com.cloudsmith.hammer.puppet.validation.File"
	 *        examinedFilesDataType="com.cloudsmith.hammer.puppet.validation.FileArray"
	 *        monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	BuildResult validate(DiagnosticChain diagnostics, File source, ValidationOptions options, File[] examinedFiles,
			IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates PP syntax for code given in code parameter.
	 * 
	 * @param diagnostics DiagnosticChain will receive calls to add Diagnostic instances for discovered problems/information.
	 * @param code A String containing PP code to be validated. Errors are reported for a fictious file "unnamed.pp".
	 *        <!-- end-model-doc -->
	 * @model monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	Resource validate(DiagnosticChain diagnostics, String code, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates validity of a file (typically a .pp file). It may or may not include diagnostics that related to linking
	 * depending on the implementation of the validator.
	 * The file parameter is a reference to a regular file.
	 * 
	 * @param diagnostics DiagnosticChain will receive calls to add Diagnostic instances for discovered problems/information.
	 * @param sourceFile A File containing .pp code (must end with .pp).
	 *        <!-- end-model-doc -->
	 * @model sourceFileDataType="com.cloudsmith.hammer.puppet.validation.File"
	 *        monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	void validateManifest(DiagnosticChain diagnostics, File sourceFile, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates PP syntax for code given in code parameter.
	 * 
	 * @param diagnostics DiagnosticChain will receive calls to add Diagnostic instances for discovered problems/information.
	 * @param code A String containing PP code to be validated. Errors are reported for a fictious file "unnamed.pp".
	 *        <!-- end-model-doc -->
	 * @model monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	Resource validateManifest(DiagnosticChain diagnostics, String code, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statically validates all files contained in a Puppet module. The File parameter is a reference to the top level folder
	 * containing the module.
	 * 
	 * @param diagnostics DiagnosticChain will receive calls to add Diagnostic instances for discovered problems/information.
	 * @param moduleDirectory A File referencing a directory containing a Puppet Module.
	 *        <!-- end-model-doc -->
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.BuildResult"
	 *        moduleDirectoryDataType="com.cloudsmith.hammer.puppet.validation.File"
	 *        monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	BuildResult validateModule(DiagnosticChain diagnostics, File moduleDirectory, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Performs static validation and catalog production for a given node, it's factor data, a site.pp file, and a directory of
	 * modules.
	 * 
	 * @param diagnostics DiagnosticChain will receive calls to add Diagnostic instances for discovered problems/information.
	 * @param catalogRoot A File referencing a directory/folder where a set of subfolders each conform to Puppet Module rules.
	 * @param factorData A File containing Factor data for the node for which the catalog should be produced/validated.
	 * @param siteFile A File referencing a site.pp (typical name) that maps hosts to puppet nodes.
	 * @param nodeName The name of the node (does not have to be the same as the hostname).
	 *        <!-- end-model-doc -->
	 * @model catalogRootDataType="com.cloudsmith.hammer.puppet.validation.File"
	 *        factorDataDataType="com.cloudsmith.hammer.puppet.validation.File"
	 *        siteFileDataType="com.cloudsmith.hammer.puppet.validation.File"
	 *        monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	void validateRepository(DiagnosticChain diagnostics, File catalogRoot, File factorData, File siteFile,
			String nodeName, IProgressMonitor monitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statically validates all modules contained in a catalog (a directory of Puppet modules). The file parameter is a reference
	 * to the top level directory.
	 * 
	 * @param diagnostics DiagnosticChain will receive calls to add Diagnostic instances for discovered problems/information.
	 * @param catalogRoot A File referencing a directory containing Puppet Module directories.
	 *        <!-- end-model-doc -->
	 * @model dataType="com.cloudsmith.hammer.puppet.validation.BuildResult"
	 *        catalogRootDataType="com.cloudsmith.hammer.puppet.validation.File"
	 *        monitorDataType="com.cloudsmith.hammer.puppet.validation.IProgressMonitor"
	 * @generated
	 */
	BuildResult validateRepository(DiagnosticChain diagnostics, File catalogRoot, IProgressMonitor monitor);

} // ValidationService
