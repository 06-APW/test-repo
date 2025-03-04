package com.jdc.apw.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.jdc.apw.tryCatchWithThrow.TryCatchWithThrow;

public class DTryCatchWithThrowTest {
	
	private static TryCatchWithThrow data;
	
	@BeforeAll
	static void init() {
		data = new TryCatchWithThrow();
	}
	
	@Test
	void testGetMessage() {
		data.useMessage();
	}
}
