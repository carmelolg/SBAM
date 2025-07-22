package it.carmelolagamba.sbam;

import it.carmelolagamba.sbam.common.config.ApplicationProperties;
import it.carmelolagamba.sbam.common.config.EnvironmentProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
@Slf4j
@AllArgsConstructor
public class Application implements CommandLineRunner {

	private final ApplicationProperties applicationProperties;
	private final EnvironmentProperties environmentProperties;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		log.info(" ---------------------------------------------------- ");
		log.info(" -- ");
		log.info(" --   Environment: {}", environmentProperties.getName());
		log.info(" --   Environment description: {}", environmentProperties.getDescription());
		log.info(" --   Rest API available at: [base-url]:{}/swagger-ui/index.html", applicationProperties.getPort());
		log.info(" -- ");
		log.info(" ---------------------------------------------------- ");
	}
}
