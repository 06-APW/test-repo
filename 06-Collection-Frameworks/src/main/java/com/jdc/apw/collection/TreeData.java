package com.jdc.apw.collection;

import java.util.Set;
import java.util.TreeSet;

// Tree type must need to implement comparable interbase
public class TreeData {
	
	private Person[] array = {
			new Person("Andrew",23),
			new Person("John",25),
			new Person("Alex",40),
			new Person("Hawk",42),
			new Person("Kelvin",27)};
	
	public TreeSet<Person> useTreeset(){
		TreeSet<Person> set = new TreeSet<Person>();
		set.addAll(Set.of(array));
		return set;
	}
}
