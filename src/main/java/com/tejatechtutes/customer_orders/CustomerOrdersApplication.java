package com.tejatechtutes.customer_orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class CustomerOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrdersApplication.class, args);
	}

}
