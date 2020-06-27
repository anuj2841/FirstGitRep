package com.anuj.springboot.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anuj.springboot.profile.service.ProfileConfigProfile;

@SpringBootApplication
public class SpringBootProfilesApplication implements CommandLineRunner{

	@Autowired
	ProfileConfigProfile profile;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		profile.setup();
	}

}
