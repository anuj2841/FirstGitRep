package com.anuj.springboot.logging.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/logs")
public class LoggingController {
	
	/*
	 * commenting default logging slf4j//Logger logger=LoggerFactory.getLogger(LoggingController.class);
	 */
	Logger logger=LogManager.getLogger(LoggingController.class);
	@GetMapping(value="/checkLogLevel")
	public void index() {
		logger.trace("Trace message");
		logger.info("Info message logs");
		logger.debug("A DEBUG Message");
		logger.warn("A WARN Message");
	    logger.error("An ERROR Message");
	}
}
