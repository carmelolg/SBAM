package it.carmelolagamba.springboot;

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
public class Application implements CommandLineRunner {

	@Autowired
	private ApplicationProperties config;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		log.info(" ---------------------------------------------------- ");
		log.info(" -- ");
		log.info(" --   Environment: {}", config.getEnvironment());
		log.info(" --   App name: {}", config.getName());
		log.info(" --   Rest API available at: {}:{}", config.getUrl(), config.getPort());
		log.info(" -- ");
		log.info(" ---------------------------------------------------- ");
	}
}
