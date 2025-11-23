package com.tcs.tcs_devops_architect_AK;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TcsDevopsArchitectAkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsDevopsArchitectAkApplication.class, args);
	}
	
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcome to TCS DevOps Architect Demo Application<h1>";
	}
	
	@GetMapping("/about")
	public String about() {
		return "<h1>We are part of DevOps Architect Training at Edureka<h1>";
	}
}
