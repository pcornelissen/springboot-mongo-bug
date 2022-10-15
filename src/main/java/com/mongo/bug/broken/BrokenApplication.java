package com.mongo.bug.broken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.mongo.bug")
public class BrokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrokenApplication.class, args);
	}

}
