package com.createiq.test;

public class TestCal {
	public static void main(String[] args) {
		Cal cal = new CalImpl();
		int accResult = cal.add(1, 1);
		int expResult = 2;
		if(accResult == expResult) {
			System.out.println("Test case Pass");
		}else {
			System.out.println("Test case failed");
		}
		
		
	}

}
