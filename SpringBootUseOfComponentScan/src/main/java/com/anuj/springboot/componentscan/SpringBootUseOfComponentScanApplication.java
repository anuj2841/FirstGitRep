package com.anuj.springboot.componentscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anuj.springboot.controller"})
public class SpringBootUseOfComponentScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUseOfComponentScanApplication.class, args);
	}

}
