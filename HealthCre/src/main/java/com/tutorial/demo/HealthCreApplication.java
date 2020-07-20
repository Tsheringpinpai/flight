package com.tutorial.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class HealthCreApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCreApplication.class, args);
	}

}
