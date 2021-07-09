package com.createiq.java8.beforejava8;

import com.createiq.java8.functionalinterface.MathOperation;

public class MathTester {

	public static void main(String[] args) {
		
		MathOperation addition = new Addition();
		MathOperation subtraction = new Subtraction();
		MathOperation multiplication = new Multiplication();
		MathOperation division = new Division();

		int a = 12;
		int b = 6;
        
		System.out.println("Number1 = "+a+" Number2 = "+b);
		System.out.println("Addition : " + addition.operation(a, b));
		System.out.println("Subtraction : " + subtraction.operation(a, b));
		System.out.println("Multiplication : " + multiplication.operation(a, b));
		System.out.println("Division : " + division.operation(a, b));

	}

}
