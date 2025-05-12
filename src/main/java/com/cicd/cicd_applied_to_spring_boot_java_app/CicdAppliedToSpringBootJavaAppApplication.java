package com.cicd.cicd_applied_to_spring_boot_java_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CicdAppliedToSpringBootJavaAppApplication {

	@GetMapping("/")
	public String getMethodName(@RequestParam(required = false) String param) {
		return "Hello World!";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
	}

}
