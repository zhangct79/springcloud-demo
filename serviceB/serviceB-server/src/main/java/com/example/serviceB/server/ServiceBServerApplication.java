package com.example.serviceB.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceBServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBServerApplication.class, args);
	}

}
