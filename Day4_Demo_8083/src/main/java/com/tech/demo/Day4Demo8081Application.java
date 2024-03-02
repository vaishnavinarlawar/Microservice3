package com.tech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day4Demo8081Application {

	public static void main(String[] args) {
		SpringApplication.run(Day4Demo8081Application.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemp() {
		return new RestTemplate();
	}
}
