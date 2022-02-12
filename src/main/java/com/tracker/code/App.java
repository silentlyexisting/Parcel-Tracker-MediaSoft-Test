package com.tracker.code;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Package Tracker API",
				version = "1.0",
				description = "Information about packages shipments"
		)
)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}