package com.capgemini.exception;

public class NoSuchReadingExistsException extends RuntimeException{
	private String message;
	public NoSuchReadingExistsException() {}
	public NoSuchReadingExistsException(String msg)
	{
		super(msg);
		this.message=msg;
	}

}
