package com.anuj.crud.jpaquery.modifyingquery.springboot.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.anuj.crud.jpaquery.modifyingquery.springboot.entites.User;

public interface UserDao extends CrudRepository<User,Integer>{
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "update User u set u.firstName=?1 where u.userId=?2")
	public int updateByUserId(String firstName,Integer userId);
}
