package com.createiq.java8.methodreferencearbitraryobject;

public class Test {
	
	public void toStringDisplay() {
		System.out.println(toString());
	}
	
	public static void main(String[] args) {
		TestDemo testDemo = Test::toStringDisplay;
		Test test = new Test();
		System.out.println(test.toString());
		testDemo.toString(test);
	}

}
