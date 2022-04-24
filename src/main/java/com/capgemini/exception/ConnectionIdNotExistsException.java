package com.capgemini.exception;

public class ConnectionIdNotExistsException extends RuntimeException {
	private String message;
	public ConnectionIdNotExistsException() {}
	public ConnectionIdNotExistsException(String msg){
		super(msg);
		this.message=msg;
		
	
	}
}
