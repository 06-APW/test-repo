package com.jdc.apw.test;

import org.junit.jupiter.api.Test;

import com.jdc.apw.*;

public class ATesting {
	Handler handle = new Handler();

	 //@Test
	void testName() {
		handle.useName();
	}

	 //@Test
	void testRecursive() {
		handle.recursive();
	}

	@Test
	void testAge() {
		handle.useAge();
	}
}
