package com.anuj.crud.jpaquery.modifyingquery.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.crud.jpaquery.modifyingquery.springboot.service.UserService;

@RestController
@RequestMapping(value="/api/modiying")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/updateByUserId",method=RequestMethod.GET)
	public int updateByUserId(@RequestParam("firstName")String firstName,@RequestParam("userId")Integer userId) {
		return userService.updateByUserId(firstName, userId);
		
	}
}
