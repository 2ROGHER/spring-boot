package org.pe.api.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class RestApplication {

	@Value("${server.port}")
	private  String port;

	public static void main(String[] args) {

		SpringApplication.run(RestApplication.class, args);

		Properties sysProperties = System.getProperties();
		String port = sysProperties.getProperty("server.port");
		System.out.println("Listening on port: " + port);

	}

	public  String showPort() {
		return port;

	}

}
