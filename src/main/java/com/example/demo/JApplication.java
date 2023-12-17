package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JApplication {

	public static void main(String[] args) {
		SpringApplication.run(JApplication.class, args);
	}

	@GetMapping()
	public String test() {
		return "working";
	}
}
