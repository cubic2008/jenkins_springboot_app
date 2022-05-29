package com.cubic.service;

import com.cubic.domain.Greeting;

public class AppServiceImpl implements AppService {
	
	private static AppService _service = new AppServiceImpl();
	
	public static AppService getInstance() {
		return _service;
	}

	@Override
	public Greeting getGreeting(String name) {
		return new Greeting ("Hello, " + name + ". How are you?");
	}

}
