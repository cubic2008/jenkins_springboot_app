package com.cubic.service;

import org.springframework.stereotype.Service;

import com.cubic.domain.Greeting;

@Service
public class AppServiceImpl implements AppService {
	
//	private static AppService _service = new AppServiceImpl();
//	
//	public static AppService getInstance() {
//		return _service;
//	}

	@Override
	public Greeting getGreeting(String name) {
		return new Greeting ("Hello, " + name + ". How are you?");
	}

}
