package com.anuj.serviceprivide.eurekadiscovery.controller;

import javax.websocket.server.PathParam;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/payment_serviceprovider")
public class SpringcloudPaymentcontroller {
	
	@GetMapping(value = "/pay/{price}")
	public String String (@PathVariable("price")String price) {
		return "Your payment "+price+" is successfull";
	}
}
