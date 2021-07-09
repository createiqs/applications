package com.createiq.java8.methodreference;

import com.createiq.java8.functionalinterface.Sayable;

public class StaticMethodReference {
	
	public static void main(String[] args) {
		Sayable sayable = SayableSomething::saySomething;
		sayable.say("Hello");
	}

}
