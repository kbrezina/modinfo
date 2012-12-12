/**
 * Copyright (c) 2012 Cloudsmith Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Cloudsmith
 * 
 */
package com.cloudsmith.hammer.puppet.validation.formatting;

import java.io.OutputStream;

import org.eclipse.emf.common.util.BasicDiagnostic;

import com.cloudsmith.hammer.puppet.validation.runner.BuildResult;

/**
 * Interface for formatting of validation/build result.
 * 
 */
public interface IValidationResultFormatter {

	/**
	 * Formats the given build result and writes it to the given output stream.
	 * 
	 * @param buildResult
	 * @param diagnosticChain
	 * @param out
	 */
	public void format(BuildResult buildResult, BasicDiagnostic diagnosticChain, OutputStream out);
}
