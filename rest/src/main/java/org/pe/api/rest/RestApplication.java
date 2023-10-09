package org.pe.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(RestApplication.class, args);

		System.out.println("Listening on port: " + 8081);

	}


}
