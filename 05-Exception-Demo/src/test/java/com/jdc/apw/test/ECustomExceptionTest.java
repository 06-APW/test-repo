package com.jdc.apw.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.jdc.apw.custom.CustomExceptionData;
import com.jdc.apw.custom.MyCheckException;
import com.jdc.apw.custom.MyUncheckException;

public class ECustomExceptionTest {
	static CustomExceptionData data;
	
	@BeforeAll
	static void init() {
		data = new CustomExceptionData();
	}
	
	@Test
	void test() {
		//System.out.println(data.getMyUncheckException("Hello"));
		assertThrows(MyUncheckException.class, () -> data.getMyUncheckException(" "));
		assertThrows(MyUncheckException.class, () -> data.changeChecktoUncheck(null));
		assertThrows(MyCheckException.class, () -> data.getMyCheckException(" "));
	}
}
