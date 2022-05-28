package com.cubic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping({"/", "/hello"})
	public String index() {
		return "Greetings from Jenkins Spring Boot App!";
	}

}
