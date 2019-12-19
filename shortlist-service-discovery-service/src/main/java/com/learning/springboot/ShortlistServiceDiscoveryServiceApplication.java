package com.learning.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShortlistServiceDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShortlistServiceDiscoveryServiceApplication.class, args);
	}

}
