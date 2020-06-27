package com.anuj.crud.namedquery.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.crud.namedquery.springboot.dao.UserDao;
import com.anuj.crud.namedquery.springboot.entites.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public List<User>findByFirstName(String firstName){
		return userDao.findByFirstName(firstName);
	}
	
	public List<User>findByFirstNameAndEmail(String firstName,String email){
		return userDao.findByFirstNameAndEmail(firstName,email);
	}
}
