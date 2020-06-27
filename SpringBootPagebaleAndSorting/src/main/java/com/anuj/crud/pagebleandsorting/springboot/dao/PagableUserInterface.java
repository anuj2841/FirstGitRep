package com.anuj.crud.pagebleandsorting.springboot.dao;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import com.anuj.crud.pagebleandsorting.springboot.entites.User;

public interface PagableUserInterface extends CrudRepository<User, Integer>{
	
	public Slice<User> findByFirstName(String firstName, Pageable of);
	public Page<User> findByLastName(String lastName,Pageable of);
	public List<User> findByEmail(String email, Pageable of);
}
