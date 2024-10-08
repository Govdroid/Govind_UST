package com.ust.Laptop_Purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class LaptopPurchaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopPurchaseApplication.class, args);
	}

}
