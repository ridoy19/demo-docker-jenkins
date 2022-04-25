package com.jakaria.demojenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsDockerApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Hello, Jakaria", HttpStatus.OK);
	}
}
