package com.capgemini.exception;

public class IdAlreadyExistsException extends RuntimeException {
	private String message;
	  
    public IdAlreadyExistsException() {}
  
    public IdAlreadyExistsException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}

