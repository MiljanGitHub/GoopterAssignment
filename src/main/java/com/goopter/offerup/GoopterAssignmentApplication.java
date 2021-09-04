package com.goopter.offerup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GoopterAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoopterAssignmentApplication.class, args);
	}

}
