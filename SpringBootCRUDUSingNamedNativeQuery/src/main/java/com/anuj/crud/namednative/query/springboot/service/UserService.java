package com.anuj.crud.namednative.query.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anuj.crud.namednative.query.springboot.dao.UserDao;
import com.anuj.crud.namednative.query.springboot.dao.entites.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public List<User> findByFirstName(String firstName){
		return userDao.findByFirstName(firstName);
	}
	
	public List<User> findByLastNameAndEmail(String lastName,String email){
		return userDao.findByLastNameAndEmail(lastName, email);
	}
	
}
