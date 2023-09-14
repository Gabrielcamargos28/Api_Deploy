package me.dio.santanderbootcamp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(servers = {@Server(url = "/", description = "default server url")})
@SpringBootApplication
public class SantanderBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcampApplication.class, args);
	}

}
