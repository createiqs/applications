package com.createiq.java8.methodreferenceconstructor;

public class ConstructorMethodReference {
	public static void main(String[] args) {
		EmployeeEmpty empEmpty = Employee::new;

		System.out.println("Constructor isn't called yet");
		System.out.println(empEmpty.get());

		EmployeeWithName empWithName = Employee::new;

		System.out.println("Constructor isn't called yet");
		System.out.println(empWithName.get("Java"));
	}

}
