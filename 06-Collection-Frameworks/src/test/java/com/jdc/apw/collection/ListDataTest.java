package com.jdc.apw.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ListDataTest {
	
	static CollectionData data ;
	
	@BeforeAll
	static void init() {
		data = new CollectionData();
	}
	
	@ParameterizedTest
	@CsvSource({"0,Andrew","3,Lucifer"})
	void selectListTest(int index,String res) {
		List<String> list = data.useList("L");
		assertEquals(res, list.get(index));
	}
	
	
	
	@ParameterizedTest
	@ValueSource(strings = {"a","L"})
	void useListTest(String str) {			// In Str, a and L value each will run for loop
		for(String s : data.useList(str.toUpperCase())) {
			System.out.println("Element : " + s);
		}
	}
}
