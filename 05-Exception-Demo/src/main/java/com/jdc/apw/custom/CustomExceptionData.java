package com.jdc.apw.custom;

public class CustomExceptionData {
	
	public String changeChecktoUncheck(String message) {
		try {
			String check = getMyCheckException(message);
			System.out.println(check);
		} catch (MyCheckException e) {
			//System.err.println(e.getMessage());
			throw new MyUncheckException(e.getMessage());
		}
		return message;
	}

	public String getMyCheckException(String message) throws MyCheckException {
		if (null == message || message.isBlank()) {
			throw new MyCheckException("There is no message yet for check");
		}
		return message;
	}

	public String getMyUncheckException(String message) {
		if (null == message || message.isBlank()) {
			throw new MyUncheckException("There is no message yet for uncheck");
		}
		return message;
	}
}
