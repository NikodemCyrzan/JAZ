package com.example.zjaz2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zjaz2Application {

	static Config config;

	public Zjaz2Application(Config config) {
		Zjaz2Application.config = config;
	}

	public static void main(String[] args) {
		SpringApplication.run(Zjaz2Application.class, args);

		System.out.println(config.loginUrl);
		System.out.println(config.credentials.user);
		System.out.println(config.credentials.password);
	}

}
