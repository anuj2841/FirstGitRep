package com.anuj.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/componentscan")
public class ComponentScanController {
	
	@RequestMapping(value="/greeting",method=RequestMethod.GET)
	public String greetingMessage() {
		return "Good morning";
	}
}
