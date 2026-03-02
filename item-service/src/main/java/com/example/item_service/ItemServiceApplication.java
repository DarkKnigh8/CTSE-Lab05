package com.example.item_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	@Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("===========================================");
            System.out.println("✅ ITEM SERVICE RUNNING ON PORT 8081");
            System.out.println("===========================================");
        };
    }

}
