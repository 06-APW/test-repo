package com.jdc.apw.custom;

@SuppressWarnings("serial")
public class MyUncheckException extends RuntimeException{
	public  MyUncheckException() {
		super();
	}
	
	public MyUncheckException(String message) {
		super(message);
	}
}
