package com.anuj.crud.namedquery.springboot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anuj.crud.namedquery.springboot.entites.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{
	
	public List<User>findByFirstName(String firstName);
	public List<User>findByFirstNameAndEmail(String firstName,String email);
}
