package com.infotech.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	
	@RequestMapping(value="/")
	public String hello() {
		return "Hello";
	}
}
