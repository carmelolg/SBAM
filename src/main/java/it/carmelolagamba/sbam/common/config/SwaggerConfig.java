package it.carmelolagamba.sbam.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class SwaggerConfig {

	private final ApplicationProperties properties;

	@Bean
	public OpenAPI springOpenAPI() {
		return new OpenAPI()
			.info(new Info().title(properties.getName())
				.description(properties.getDescription())
				.version(properties.getVersion()));
	}

}
