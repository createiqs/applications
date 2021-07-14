package com.createiq.java8.interfaces_defaultmethods.multiple_inheritance;

public class Example implements MyInterface, MyInterface2 {
	// implementing abstract methods
	public void existingMethod(String str) {
		System.out.println("String is: " + str);
	}

	public void disp(String str) {
		System.out.println("String is: " + str);
	}

	// Implementation of duplicate default method
	public void newMethod() {
		System.out.println("Implementation of default method");
		MyInterface.super.newMethod();
		MyInterface2.super.newMethod();
	}

	public static void main(String[] args) {
		Example obj = new Example();

		// calling the default method of interface
		obj.newMethod();

	}
}