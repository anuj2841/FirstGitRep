package com.anuj.named.param.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anuj.named.param.springboot.entites.User;

@Repository
public interface UserDao extends CrudRepository<User,Integer>{
	@Query(value = "select u from User u where u.firstName=:firstName",nativeQuery = false)
	public List<User> findByFirstName(@Param("firstName") String firstName);
}
