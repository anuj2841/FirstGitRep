package com.anuj.crud.jpaquery.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.anuj.crud.jpaquery.springboot.entites.User;
import com.anuj.crud.jpaquery.springboot.service.UserService;

@RestController
@RequestMapping(value="/api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/findByFirstName",method=RequestMethod.GET)
	public List<User> findByfirstName(@RequestParam("firstName")String firstName){
		return userService.findByfirstName(firstName);
	}
}
