package com.jdc.apw.tryCatchWithThrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class TryCatchWithThrow {

	public void useMessage() {
		try {
			String message1 = getData();	// Checked exception so require to try/catch or throw

			System.out.println(checkMessage(message1));
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			
		}catch(NoSuchElementException e) {
			System.err.println(e.getMessage());
		}

	}
	
	// When create check type exception,must be thrown that type
	// When create uncheck type exception,not require to be thrown
	// When you use throws, it must be same type or super type.
	private String checkMessage(String message) throws NullPointerException {
		if (message.isBlank()) {			
			throw new NullPointerException("There is no message!");
		}
		return message;
	}
	
	
	private String getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type your message !");
		String message = br.readLine();
		return message;
	}

}
