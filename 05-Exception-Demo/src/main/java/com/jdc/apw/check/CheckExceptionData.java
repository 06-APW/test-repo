package com.jdc.apw.check;

import java.io.File;
import java.io.IOException;

public class CheckExceptionData {
	
	public String createFile(String dir) {
		try {
			File file = new File(dir + "Test.txt");
			file.createNewFile();
			return file.exists() ? "exist" : "Doesn't exist";
			
		} catch(IOException e) {
			return "IOException";
		}
	}
}
