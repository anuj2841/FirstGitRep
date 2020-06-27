package com.anuj.springboot.custom.whilelableerror.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhiteLabelErrorController implements ErrorController{
	
	private static final String PATH = "/error";
	
	@RequestMapping(value = "/greeting",method=RequestMethod.GET)
	public String greetingMsg() {
		return "Hello word";
	}
	
	@RequestMapping(value =PATH,method=RequestMethod.GET)
	public String customWhiteLabelErrorMsg() {
		return "Custom white label error";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return PATH;
	}

}
