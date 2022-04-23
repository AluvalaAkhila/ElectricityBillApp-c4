package com.capgemini.exception;

public class PaymentAlreadyExistsException extends RuntimeException{
	private String message;
	public PaymentAlreadyExistsException() {}
	public PaymentAlreadyExistsException(String msg)
	{
		super(msg);
		this.message=msg;
	}

}
