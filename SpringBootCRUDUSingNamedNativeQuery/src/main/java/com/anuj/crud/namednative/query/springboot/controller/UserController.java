package com.anuj.crud.namednative.query.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.crud.namednative.query.springboot.dao.entites.User;
import com.anuj.crud.namednative.query.springboot.service.UserService;

@RestController
@RequestMapping(value="api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/findbyFirstName",method=RequestMethod.GET)
	public List<User> findByFirstName(@RequestParam("firstName")String firstName){
		return userService.findByFirstName(firstName);
	}
	
	@RequestMapping(value="/findByNameAndEmail",method=RequestMethod.GET)
	public List<User> findByLastNameAndEmail(@RequestParam("lastName")String lastName,@RequestParam("email")String email){
		return userService.findByLastNameAndEmail(lastName, email);
	}
	
}
