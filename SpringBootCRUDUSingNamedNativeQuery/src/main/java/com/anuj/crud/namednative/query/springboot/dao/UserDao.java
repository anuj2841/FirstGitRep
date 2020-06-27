package com.anuj.crud.namednative.query.springboot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anuj.crud.namednative.query.springboot.dao.entites.User;

@Repository
public interface UserDao extends CrudRepository<User,Integer>{
	
	public List<User> findByFirstName(String firstName);
	public List<User> findByLastNameAndEmail(String lastName,String email);
}
