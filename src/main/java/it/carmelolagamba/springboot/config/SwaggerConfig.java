package it.carmelolagamba.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI springOpenAPI() {
		return new OpenAPI()
			.info(new Info().title("Spring Boot API")
				.description("Spring Boot sample application")
				.version("v0.0.2"));
	}

}
