package com.jdc.apw.collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetDataTest {
	
	static CollectionData data ;
	static TreeData tree;
	
	@BeforeAll
	static void init() {
		data = new CollectionData();
		tree = new TreeData();
	}
	
	@ParameterizedTest
	@CsvSource({"0,Andrew","3,Lucifer"})
	void selectListTest(int index,String res) {
		
	}
	
	@Test
	void treeSetTest() {
		TreeSet<Person> set = tree.useTreeset();
		for(Person p : set) {
			System.out.println(p.name() + "\t" + p.age());
		}
	}
	
	@Disabled
	@ParameterizedTest
	@ValueSource(strings = {"h","L","t"})
	void useSetTest(String str) {			// In Str, a and L value each will run for loop
		System.out.println(str);
		for(String s : data.useSet(str.toUpperCase())) {
			System.out.println("Element : " + s);
		}
		System.out.println();
	}
}
