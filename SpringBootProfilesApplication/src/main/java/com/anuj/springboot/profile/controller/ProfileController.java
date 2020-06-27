package com.anuj.springboot.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/profile")
public class ProfileController {
	
	@Value("${message}")
	private String message;
	
	@GetMapping(value="/message")
	public String getMessage() {
		return message;
	}
}
