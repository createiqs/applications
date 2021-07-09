package com.createiq.java8.beforejava8;

import com.createiq.java8.functionalinterface.MathOperation;

public class Addition implements MathOperation{

	@Override
	public int operation(int a, int b) {
		return a+b;
	}

}
