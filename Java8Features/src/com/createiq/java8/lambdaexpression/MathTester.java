package com.createiq.java8.lambdaexpression;

import com.createiq.java8.functionalinterface.MathOperation;

public class MathTester {

	public static void main(String[] args) {

		MathOperation addition = (a, b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (a, b) -> a * b;
		MathOperation division = (a, b) -> a / b;

		int a = 12;
		int b = 6;

		System.out.println("Number1 = " + a + " Number2 = " + b);
		System.out.println("Addition : " + addition.operation(a, b));
		System.out.println("Subtraction : " + subtraction.operation(a, b));
		System.out.println("Multiplication : " + multiplication.operation(a, b));
		System.out.println("Division : " + division.operation(a, b));

	}

}
