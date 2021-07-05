package com.createiq.calTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.createiq.test.Cal;
import com.createiq.test.CalImpl;

public class CalTest {

	@Before
	public void before() {
		System.out.println("Before");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class..");
	}

	@Test
	public void addTest1() {
		Cal cal = new CalImpl();
		assertEquals(10, cal.add(5, 5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void addTest2() {
		Cal cal = new CalImpl();
		assertEquals(0, cal.add(-5, 5));
	}

	@Test
	public void addTest3() {
		Cal cal = new CalImpl();
		assertEquals(55, cal.add(5, 50));
	}

	@After
	public void after() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class..");
	}

}
