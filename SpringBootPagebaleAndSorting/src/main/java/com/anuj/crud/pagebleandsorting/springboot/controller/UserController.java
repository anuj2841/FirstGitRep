package com.anuj.crud.pagebleandsorting.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.anuj.crud.pagebleandsorting.springboot.entites.User;
import com.anuj.crud.pagebleandsorting.springboot.service.UserService;

@RestController
@RequestMapping(value = "/api/pagable")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/slice/findByFirstName",method=RequestMethod.GET)
	public Slice<User> findByFirstName(@RequestParam("firstName")String firstName){
		return userService.findByFirstName(firstName,PageRequest.of(0, 1, Sort.Direction.DESC, "lastName"));
	}
	
	@RequestMapping(value="/page/findByLastName",method=RequestMethod.GET)
	public Page<User> findByLastName(@RequestParam("lastName")String lastName){
		return userService.findByLastName(lastName,PageRequest.of(0,2,Direction.DESC,"lastName"));
	}
	
	@RequestMapping(value="/findByEmail",method=RequestMethod.GET)
	public List<User> findByEmail(@RequestParam("email")String email){
		return userService.findByEmail(email,PageRequest.of(0,2,Direction.DESC,"firstName"));
	}
	
}
