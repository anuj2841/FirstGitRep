package com.anuj.cloud.eurekaclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/payment_client")
public class PaymentCloudClientEureka {
	
	@Autowired
	private RestTemplate template;
	
   @GetMapping(value="/paymentMicroservice/{price}")
	public String invokePaymentMicroservice(@PathVariable("price")String price) {
	    String url= "http://PAYMENT-SERVICE/payment_serviceprovider/pay/200";
		return template.getForObject(url,String.class);
	}
}
