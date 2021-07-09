package com.createiq.java8.lambdaexpression;

import com.createiq.java8.functionalinterface.Sayable;

public class SaybleTester {
	public static void main(String[] args) {
		Sayable sayable = (msg) -> System.out.println(msg);
		sayable.say("Hello");
	}
}
