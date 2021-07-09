package com.createiq.java8.methodreference;

import com.createiq.java8.functionalinterface.MathOperation;

public class InstanceMethodReference {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		MathOperation addition = calculator::add;
		MathOperation subtraction = calculator::sub;
		MathOperation multiplication = calculator::mul;
		MathOperation division = calculator::div;

		int a = 12;
		int b = 6;

		System.out.println("Number1 = " + a + " Number2 = " + b);
		System.out.println("Addition : " + addition.operation(a, b));
		System.out.println("Subtraction : " + subtraction.operation(a, b));
		System.out.println("Multiplication : " + multiplication.operation(a, b));
		System.out.println("Division : " + division.operation(a, b));
	}
}
