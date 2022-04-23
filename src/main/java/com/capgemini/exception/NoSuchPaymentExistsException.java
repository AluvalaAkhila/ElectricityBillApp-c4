package com.capgemini.exception;

public class NoSuchPaymentExistsException extends RuntimeException {
	private String message;
	public NoSuchPaymentExistsException() {}
	public NoSuchPaymentExistsException(String msg)
	{
		super(msg);
		this.message=msg;
	}

}
