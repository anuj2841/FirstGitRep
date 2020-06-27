package com.anuj.async.springboot.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.anuj.async.springboot.entites.User;
import com.anuj.async.springboot.service.UserService;

@RestController
@RequestMapping(value = "/api/async")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/findByFirstName",method=RequestMethod.GET)
	public void findByFirstName(@RequestParam("firstName")String firstName) throws InterruptedException, ExecutionException, TimeoutException {
		Future<User> future=userService.findByFirstName(firstName);
		User user=future.get(1, TimeUnit.SECONDS);
		System.out.println(user);
		
	}
	@RequestMapping(value="/findByLastName",method=RequestMethod.GET)
	public void findByLastName(@RequestParam("lastName")String lastName) throws InterruptedException, ExecutionException, TimeoutException {
		CompletableFuture<User> completableFuture=userService.findByLastName(lastName);
		User user=completableFuture.get(20,TimeUnit.SECONDS);
		System.out.println(user);
		
	}
}
