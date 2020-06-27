package com.anuj.crud.pagebleandsorting.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import com.anuj.crud.pagebleandsorting.springboot.dao.PagableUserInterface;
import com.anuj.crud.pagebleandsorting.springboot.entites.User;

@Service
public class UserService {
	
	@Autowired
	PagableUserInterface userDao;

	public Slice<User> findByFirstName(String firstName, Pageable  of) {
		return userDao.findByFirstName(firstName,of);
	}

	public Page<User> findByLastName(String lastName, Pageable of) {
		return userDao.findByLastName(lastName, of);
	}

	public List<User> findByEmail(String email, Pageable of) {
		return userDao.findByEmail(email,of);
	}
}
