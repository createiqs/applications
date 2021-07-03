package com.createiq.test;

public class CalImpl implements Cal {

	public int add(int a, int b) {
		
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException();
		}
		return a * b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

}
