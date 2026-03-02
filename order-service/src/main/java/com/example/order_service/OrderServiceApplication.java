package com.example.order_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("===========================================");
            System.out.println("✅ ORDER SERVICE RUNNING ON PORT 8082");
            System.out.println("===========================================");
        };
    }

}
