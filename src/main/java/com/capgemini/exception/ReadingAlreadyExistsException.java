package com.capgemini.exception;

public class ReadingAlreadyExistsException extends RuntimeException{
	private String message;
	public ReadingAlreadyExistsException() {}
	public ReadingAlreadyExistsException(String msg)
	{
		super(msg);
		this.message=msg;
	}

}
