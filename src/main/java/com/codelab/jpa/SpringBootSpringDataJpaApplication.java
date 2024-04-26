package com.codelab.jpa;

//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Employee-Service",
		version = "1.0",
		description = "Employees Information"
),
servers = @Server(
		url = "http://localhost:8080",
		description = "Employee Rest OpenApi"

  )

)
public class SpringBootSpringDataJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootSpringDataJpaApplication.class, args);
	}

}
