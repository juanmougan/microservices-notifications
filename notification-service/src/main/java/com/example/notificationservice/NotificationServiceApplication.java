package com.example.notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		// TODO seed data: https://developer.okta.com/blog/2019/05/22/java-microservices-spring-boot-spring-cloud
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

}
