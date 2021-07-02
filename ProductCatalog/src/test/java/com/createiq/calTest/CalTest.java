package com.createiq.calTest;


import static org.junit.Assert.*;
import org.junit.Test;

import com.createiq.test.Cal;
import com.createiq.test.CalImpl;

public class CalTest {
	@Test
	public void addTest1() {
		Cal cal = new CalImpl();
		assertEquals(10, cal.add(5, 5));
	}

	@Test
	public void addTest2() {
		Cal cal = new CalImpl();
		assertEquals(0, cal.add(-5, 5));	}

	@Test
	public void addTest3() {
		Cal cal = new CalImpl();
		assertEquals(55, cal.add(5, 50));	}

}
