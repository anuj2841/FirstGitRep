package com.anuj.async.springboot.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.async.springboot.dao.UserDao;
import com.anuj.async.springboot.entites.User;

@Service
public class UserService {
    
	@Autowired
	UserDao userDao;
	
	public Future<User> findByFirstName(String firstName) {
		return userDao.findByFirstName(firstName);
	}

	public CompletableFuture<User> findByLastName(String lastName) {
		return userDao.findByLastName(lastName);
	}

}
