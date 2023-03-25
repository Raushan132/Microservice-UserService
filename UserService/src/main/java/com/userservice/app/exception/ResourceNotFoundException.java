package com.userservice.app.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4124375125610441799L;
	
	public ResourceNotFoundException() {
		super("Resource Not found");
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
