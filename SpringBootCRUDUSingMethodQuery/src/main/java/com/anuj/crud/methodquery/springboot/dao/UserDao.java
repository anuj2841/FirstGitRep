package com.anuj.crud.methodquery.springboot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anuj.crud.methodquery.springboot.entities.User;

@Repository
public interface UserDao extends CrudRepository<User,Integer>{
	public List<User> findByLastName(String lastName);
	public List<User> findByFirstNameAndEmail(String firstName,String email);
}
