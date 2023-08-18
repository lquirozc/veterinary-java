package com.prueba.veterinary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.prueba.veterinary")
@EnableJpaRepositories(basePackages = "com.prueba.veterinary.repository")
public class VeterinaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinaryApplication.class, args);
	}

}
