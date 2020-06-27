package com.anuj.crud.jpaquery.springboot.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.anuj.crud.jpaquery.springboot.entites.User;

public interface UserDao extends CrudRepository<User,Integer>{
	
	//@Query(value = "SELECT * FROM User WHERE first_name=?1",nativeQuery = true)
	@Query(value = "SELECT u FROM User u WHERE u.firstName=?1",nativeQuery = false)
	public List<User> findByFirstName(String firstName);
}
