package com.anuj.springboot.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingApplication.class, args);
		Logger logger=LogManager.getLogger(SpringBootLoggingApplication.class);
		logger.trace("Inside trace logs");
		logger.info("Inside info logs");
		logger.debug("Inside debug logs");
		logger.warn("Inside warn logs");
	}

}
