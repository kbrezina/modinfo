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
package com.cloudsmith.hammer.puppet.validation.runner;

import org.eclipse.emf.common.util.URI;

/**
 * A provider of encodings for files.
 * 
 */
public interface IEncodingProvider {

	/**
	 * Produces the wanted encoding of the content of the given file. The returned String must be a valid
	 * encoding name as used by EMF Resource loading.
	 * 
	 * @param f
	 * @return an encoding name
	 */
	String getEncoding(URI f);
}
