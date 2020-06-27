package com.anuj.crud.methodquery.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.crud.methodquery.springboot.entities.User;
import com.anuj.crud.methodquery.springboot.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/findAllUserDetails",method = RequestMethod.GET)
	private Iterable<User> getAllUserDetatils() {
		return userService.getAllUserDetatils();
	}
	
	@RequestMapping(value = "/findByLastName")
	private List<User> findByLastName(@RequestParam("lastName")String lastName){
		return userService.findByLastName(lastName);
		
	}
	
	@GetMapping(value = "/findByNameAndEmail")
	private List<User> findByFirstNameAndEmail(@RequestParam("firstName")String firstName,@RequestParam("email")String email){
		System.out.println("firstName:"+firstName+"email:"+email);
		return userService.findByFirstNameAndEmail(firstName,email);
	}
}
