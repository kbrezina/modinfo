package com.cloudsmith.hammer.puppet.validation.runner;

public class ValidationAssertionError extends AssertionError {
	private static final long serialVersionUID = 1L;

	public ValidationAssertionError(String message) {
		super(message);
	}
}
