package com.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.job.controller","com.job.model","com.job.repo"})
public class JobHuntApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobHuntApiApplication.class, args);
	}

}
