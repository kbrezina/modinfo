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
package com.cloudsmith.puppet.modinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author filip.hrbek@gmail.com
 * 
 */
public class ModuleInfo {

	private String location;

	private List<Diagnostic> diagnostics;

	private List<String> classes;

	public ModuleInfo(String location, List<String> classes) {
		this.location = location;
		this.classes = classes;
		diagnostics = new ArrayList<Diagnostic>();
	}

	public void addDiagnostic(Diagnostic diagnostic) {
		diagnostics.add(diagnostic);
	}

	public List<String> getClasses() {
		return classes;
	}

	public int getDiagnosticCount(int severity) {
		int count = 0;
		for(Diagnostic diag : diagnostics)
			if(diag.getSeverity() == severity)
				count++;

		return count;
	}

	public List<Diagnostic> getDiagnostics() {
		return diagnostics;
	}

	public List<Diagnostic> getDiagnostics(int severity) {
		List<Diagnostic> filtered = new ArrayList<Diagnostic>();

		for(Diagnostic diag : diagnostics)
			if(diag.getSeverity() == severity)
				filtered.add(diag);

		return filtered;
	}

	public int getErrorCount() {
		return getDiagnosticCount(MessageWithSeverity.ERROR);
	}

	public String getLocation() {
		return location;
	}

	public int getWarningCount() {
		return getDiagnosticCount(MessageWithSeverity.WARNING);
	}

}
