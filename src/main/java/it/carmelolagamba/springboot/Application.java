package it.carmelolagamba.springboot;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import it.carmelolagamba.springboot.config.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
@Slf4j
@AllArgsConstructor
public class Application implements CommandLineRunner {

	private final ApplicationProperties config;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		log.info(" ---------------------------------------------------- ");
		log.info(" -- ");
		log.info(" --   Environment: {}", config.getEnvironment());
		log.info(" --   App description: {}", config.getDescription());
		log.info(" --   Rest API available at: [base-url]:{}/swagger-ui/index.html", config.getPort());
		log.info(" -- ");
		log.info(" ---------------------------------------------------- ");
	}
}
