package com.anuj.crud.jpaquery.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anuj.crud.jpaquery.springboot.dao.UserDao;
import com.anuj.crud.jpaquery.springboot.entites.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public List<User> findByfirstName(String firstName){
		return userDao.findByFirstName(firstName);
	}
}
