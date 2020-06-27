package com.anuj.crud.namedquery.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.crud.namedquery.springboot.entites.User;
import com.anuj.crud.namedquery.springboot.service.UserService;

@RestController
@RequestMapping(value="/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/findByFirstName",method=RequestMethod.GET)
	public List<User> findByFirstName(@RequestParam("firstName")String firstName){
		return userService.findByFirstName(firstName);
	}
	
	@RequestMapping(value="/findByNameAndEmail",method=RequestMethod.GET)
	public List<User> findByNameAndEmail(@RequestParam("firstName")String firstName,@RequestParam("email")String email){
		return userService.findByFirstNameAndEmail(firstName, email);
	}
}
