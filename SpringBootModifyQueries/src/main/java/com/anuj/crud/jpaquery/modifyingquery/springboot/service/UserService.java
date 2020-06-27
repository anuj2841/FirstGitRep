package com.anuj.crud.jpaquery.modifyingquery.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.crud.jpaquery.modifyingquery.springboot.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public int updateByUserId(String firstName,Integer userId) {
		return userDao.updateByUserId(firstName, userId);
	}
}
