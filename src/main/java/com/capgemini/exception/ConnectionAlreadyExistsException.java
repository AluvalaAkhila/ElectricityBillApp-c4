package com.capgemini.exception;

public class ConnectionAlreadyExistsException extends RuntimeException{
	private String message;
	public ConnectionAlreadyExistsException() {}
	public ConnectionAlreadyExistsException(String msg)
	{
		super(msg);
		this.message=msg;
	}

}
