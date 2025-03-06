package com.jdc.apw;

public class Handler {

	private Person person;
	int count = 1;

	public Handler() {
		super();
		person = new Person(); 	// If this is not written,NullPointerException will occur.
	}

	// NullPointerException when person object is not created yet.
	public void useName() {
		try {
			person.setName("John Doe");
			System.out.println(person.getName());

		} catch (NullPointerException e) {
			System.out.println("This is NullPointerException because there is nothing in person object");
		}

	}

	public void useAge() {
		try {
			person.setAge(20);
			int age = dividedByZero(person.getAge());
			System.out.println(age);

		} catch (ArithmeticException e) {
			System.out.println("This is ArithmeticException because number can't be divided by Zero");
		}

	}

	// Stack Overflow error
	public void recursive() {
		try {
			if (count > 0) {
				System.out.println("recursive :" + count);
				count++;
				recursive();
			}
		} catch (Exception e) {
			System.out.println("This is StackOverflowError cause of recursive");
		}

	}

	// ArithemethicException
	private int dividedByZero(int age) {
		return age / 0;
	}
}
