package com.capgemini.exception;

public class NoSuchUserException extends RuntimeException{
	private String message;
	public NoSuchUserException() {}
	public NoSuchUserException(String msg)
	{
		super(msg);
		this.message=msg;
	}

	

}
