package com.anuj.springboot.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevProfileClass implements ProfileConfigProfile{

	@Override
	public void setup() {
		System.out.println("Inside Dev Service");
	}

}
