package com.anuj.crud.methodquery.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.crud.methodquery.springboot.dao.UserDao;
import com.anuj.crud.methodquery.springboot.entities.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public Iterable<User> getAllUserDetatils() {
		return userDao.findAll();
	}

	public List<User> findByLastName(String lastName) {
		return userDao.findByLastName(lastName);
	}

	public List<User> findByFirstNameAndEmail(String firstName, String email) {
		return userDao.findByFirstNameAndEmail(firstName,email);
	}
}
