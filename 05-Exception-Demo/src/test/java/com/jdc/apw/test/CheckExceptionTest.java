package com.jdc.apw.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.apw.check.CheckExceptionData;

public class CheckExceptionTest {
	CheckExceptionData data = new CheckExceptionData();
	@Test
	void fileTest() {
		String result = data.createFile("");
		assertEquals(result, "exist");
		
		String result2 = data.createFile("D:/data/");
		assertEquals(result2, "IOException");
	}
}
