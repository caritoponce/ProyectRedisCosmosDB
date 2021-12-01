package com.example.exampleschedule;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCosmosRepositories
public class ExamplescheduleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExamplescheduleApplication.class, args);
	}

}
