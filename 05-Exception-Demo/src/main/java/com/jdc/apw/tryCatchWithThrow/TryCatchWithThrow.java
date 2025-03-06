package com.jdc.apw.tryCatchWithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchWithThrow {

	public void useMessage(){
		try {
			String message1 = getData();	

			System.out.println(checkMessage(message1));
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			
		}catch (NullPointerException e) {
			System.err.println(e.getMessage());
			System.out.println("Null Pointer error");
		}	
		catch(Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Exception error");
		}

	}
	
	// When create check type exception,must be thrown that type
	// When create uncheck type exception,not require to be thrown
	// When you use throws, it must be same type or super type of [throw new]
	private String checkMessage(String message) throws Exception {
		if (null == message || message.isBlank()) {			
			throw new NullPointerException("There is no message!");		// Check -> Require to try catch or throw
		}
		return message;
	}
	
	
	private String getData() throws IOException {		// Check -> Require to try catch or throw
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your message !");
		String message = br.readLine();
		return message;
	}

}
