package com.anuj.named.param.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.named.param.springboot.dao.UserDao;
import com.anuj.named.param.springboot.entites.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public List<User> findByFirstName(String firstName) {
		return userDao.findByFirstName(firstName);
	}

}
