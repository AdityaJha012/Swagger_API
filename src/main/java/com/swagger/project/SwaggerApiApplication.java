package com.swagger.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
			title = "Student Open API", 
			version = "1.0.0", 
			description = "Student Open API documentation"
	), servers = @Server(
			url = "http://localhost:9193",
			description = "Student Open API Url"
	)
)
public class SwaggerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApiApplication.class, args);
	}

}
