package com.anuj.async.springboot.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.concurrent.ListenableFuture;

import com.anuj.async.springboot.entites.User;

public interface UserDao extends CrudRepository<User,Integer>{
	@Async
	public Future<User> findByFirstName(String firstName);
	@Async
	public CompletableFuture<User> findByLastName(String lastName);
	@Async
	public ListenableFuture<User> findByEmail(String email);

}
