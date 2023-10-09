package org.pe.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestApplication.class, args);
		Properties p = System.getProperties();
		String port = p.getProperty("server.port");
		System.out.println("Listening on port: " + port);
	}

}
