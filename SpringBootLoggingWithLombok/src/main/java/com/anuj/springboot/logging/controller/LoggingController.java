package com.anuj.springboot.logging.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value="/logs")
@Log4j2
public class LoggingController {
	
	/*
	 * commenting default logging slf4j//Logger logger=LoggerFactory.getLogger(LoggingController.class);
	 */
	/*
	 * Remove this log code to make code easier using lomlock
	 */
	//Logger logger=LogManager.getLogger(LoggingController.class);
	@GetMapping(value="/checkLogLevel")
	public void index() {
	}
}
