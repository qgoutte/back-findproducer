package com.goutteq.backfindproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/greetings")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
