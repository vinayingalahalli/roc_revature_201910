package com.app.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloTest {

	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("Hello from @BeforeAll");
	}
	
	
	@BeforeEach
	public void helloBeforeEach() {
		System.out.println("hello from @BeforeEach, this will be executed before every Test case in this class");
	}
	
	
	@Test
	public void testHello1() {
		System.out.println("Hello from hello1Test()");
	}
	
	@Test
	public void testHello2() {
		System.out.println("Hello from hello2Test()");
	}
	
	
	@AfterEach
	public void helloAfterEach() {
		System.out.println("hello from @AfterEach, this will be executed after every Test case in this class");
	}
	
	@AfterAll
	public static void helloAfterAll() {
		System.out.println("Hello from @AfterAll");
	}
}
