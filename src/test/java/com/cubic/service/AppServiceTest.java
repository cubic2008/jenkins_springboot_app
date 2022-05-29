package com.cubic.service;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cubic.domain.Greeting;

@RunWith(SpringRunner.class)
@SpringBootTest
//@SuiteClasses({})
public class AppServiceTest {
	
	@Autowired
	private AppService appService;
	
//	@Before
//	public void init() {
//		appService = AppServiceImpl.getInstance();
//	}
	
	@Test
	public void testGreeting() {
		String name = "John";
		Greeting expected = new Greeting ("Hello, " + name + ". How are you?");
		Greeting actual = appService.getGreeting(name);
		expected.setTime(actual.getTime());
		System.out.println("-------------------------------");
		System.out.println( expected.equals(actual) );
		System.out.println("-------------------------------");
		assertEquals(actual, expected);
	}

	@Test
	public void testGreetingForMary() {
		Greeting expected = new Greeting ("Hello, mary. How are you?");
		Greeting actual = appService.getGreeting("Mary");
		expected.setTime(actual.getTime());
		assertEquals(actual, expected);
	}
}
