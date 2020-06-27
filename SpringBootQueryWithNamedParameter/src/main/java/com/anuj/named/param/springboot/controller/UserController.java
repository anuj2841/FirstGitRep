package com.anuj.named.param.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.named.param.springboot.entites.User;
import com.anuj.named.param.springboot.service.UserService;

@RestController
@RequestMapping(value="/api/namedparameter")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/findByFirstName")
	public List<User> findByFirstName(@RequestParam("firstName")String firstName){
		return userService.findByFirstName(firstName);
		
	}
}
