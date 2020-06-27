package com.anuj.cloud.amazon.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudAmazonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAmazonEurekaServerApplication.class, args);
	}

}
