package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping(path = "/hello")
	public String getHello() {
		return "hello Krishna Kumar Singh";
	}

}
