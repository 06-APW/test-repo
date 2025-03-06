package com.jdc.apw.collection;

public record Person(String name, int age) implements Comparable<Person>{
	@Override
	public int compareTo(Person p) {
		//return name.compareTo(p.name);			
		// return p.name.compareTo(name);
		 return age > p.age ? 1 : -1;
		// return p.age > age ? 1 : -1;
	}
	
}
