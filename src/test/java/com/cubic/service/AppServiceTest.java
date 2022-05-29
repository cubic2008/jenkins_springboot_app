package com.cubic.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Suite.SuiteClasses;

import com.cubic.domain.Greeting;

//@RunWith(Suite.class)
@SuiteClasses({})
public class AppServiceTest {
	
	private AppService appService;
	
	@Before
	public void init() {
		appService = AppServiceImpl.getInstance();
	}
	
	@Test
	public void testGreeting() {
		String name = "John";
		Greeting expected = new Greeting ("Hello, " + name + ".How are you?");
		Greeting actual = appService.getGreeting(name);
		expected.setTime(actual.getTime());
		assertEquals(actual, expected);
	}

}
