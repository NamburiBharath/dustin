package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DustinApplication {

	@GetMapping("/msg")
public String message() {
		return "Hello.... Where are you?";
	}
	public static void main(String[] args) {
		SpringApplication.run(DustinApplication.class, args);
	}

}
