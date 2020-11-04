package com.app.service.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.MyService;
import com.app.service.impl.MyServiceImpl;

class MyServiceImplTest {
	
	private static MyService service;
	
	@BeforeAll
	public static void setUpService() {
		service=new MyServiceImpl();
	}

	@Test
	void testIsValidPrimeNumber() {
		boolean b=service.isValidPrimeNumber(3);
		//assertEquals(true, b);
		assertTrue(b);
	}
	
	@Test
	void testIsValidPrimeNumberNegative() {
		boolean b=service.isValidPrimeNumber(6);
		//assertEquals(true, b);
		assertFalse(b);
	}

	@Test
	void testIsValidMobileNumber() {
		assertEquals(true, service.isValidMobileNumber("+1-1234567890"));
	}
	
	@Test
	void testIsValidMobileNumberForNull() {
		assertEquals(false, service.isValidMobileNumber(null));
	}

}
