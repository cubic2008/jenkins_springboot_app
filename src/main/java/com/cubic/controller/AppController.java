package com.cubic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cubic.domain.Greeting;
import com.cubic.service.AppServiceImpl;

@RestController
public class AppController {
	
	@GetMapping({"/", "/hello"})
	public String index() {
		return "Greetings from Jenkins Spring Boot App!";
	}
	
//	public String index2() {
//		return "Greetings from Jenkins Spring Boot App!";
//	}

	@RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Greeting greeting(@PathVariable("name") String name) {
		return AppServiceImpl.getInstance().getGreeting(name);
		
	}

}
