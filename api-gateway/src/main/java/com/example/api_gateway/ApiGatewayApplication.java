package com.example.api_gateway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("===========================================");
            System.out.println("✅ API GATEWAY RUNNING ON PORT 8084");
            System.out.println("===========================================");
        };
    }

}
