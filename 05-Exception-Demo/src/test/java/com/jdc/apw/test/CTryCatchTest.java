package com.jdc.apw.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.apw.trycatch.TryCatchData;

public class CTryCatchTest {
	
	TryCatchData data = new TryCatchData();
	

	@Test 
	void testTryWithFinally() {
		String res = data.useCheckedWithTryFinallyCatch();
		System.out.println(res);
	}
	
	@Disabled
	@Test
	void testTryMultiCatch() {
		int res = data.useUncheckedWithTryMultiCatch( new int[2], "1");
		assertEquals(res, -1);
		int res2 = data.useUncheckedWithTryMultiCatch( new int[2], "Hello");
		assertEquals(res2, -1);
	}
	
	@Disabled
	@Test
	void testTryCatch() {
		String res1 = data.useUncheckedWithTryCatch(122);
		System.out.println(res1);
		assertEquals(res1, "ClassCastException");
		
		
	}
}
