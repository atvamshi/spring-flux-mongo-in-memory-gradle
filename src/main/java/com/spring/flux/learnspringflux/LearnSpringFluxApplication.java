package com.spring.flux.learnspringflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories

public class LearnSpringFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFluxApplication.class, args);
	}

}
