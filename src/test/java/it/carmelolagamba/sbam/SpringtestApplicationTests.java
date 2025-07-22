package it.carmelolagamba.sbam;

import it.carmelolagamba.sbam.common.config.ApplicationProperties;
import it.carmelolagamba.sbam.common.config.EnvironmentProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpringtestApplicationTests {

	@Test
	void contextLoads() {
	}

	private ApplicationProperties applicationProperties;
	private EnvironmentProperties environmentProperties;
	private Application application;

	@BeforeEach
	void setUp() {
		applicationProperties = mock(ApplicationProperties.class);
		environmentProperties = mock(EnvironmentProperties.class);
		application = new Application(applicationProperties, environmentProperties);
	}

	@Test
	@DisplayName("Logs environment and application details successfully")
	void logsEnvironmentAndApplicationDetailsSuccessfully() {
		when(environmentProperties.getName()).thenReturn("Test Environment");
		when(environmentProperties.getDescription()).thenReturn("Test Description");
		when(applicationProperties.getPort()).thenReturn(8080);

		application.run();

		verify(environmentProperties, times(1)).getName();
		verify(environmentProperties, times(1)).getDescription();
		verify(applicationProperties, times(1)).getPort();
	}

	@Test
	@DisplayName("Handles null environment properties gracefully")
	void handlesNullEnvironmentPropertiesGracefully() {
		when(environmentProperties.getName()).thenReturn(null);
		when(environmentProperties.getDescription()).thenReturn(null);
		when(applicationProperties.getPort()).thenReturn(8080);

		application.run();

		verify(environmentProperties, times(1)).getName();
		verify(environmentProperties, times(1)).getDescription();
		verify(applicationProperties, times(1)).getPort();
	}

	@Test
	@DisplayName("Handles null application properties gracefully")
	void handlesNullApplicationPropertiesGracefully() {
		when(environmentProperties.getName()).thenReturn("Test Environment");
		when(environmentProperties.getDescription()).thenReturn("Test Description");
		when(applicationProperties.getPort()).thenReturn(null);

		application.run();

		verify(environmentProperties, times(1)).getName();
		verify(environmentProperties, times(1)).getDescription();
		verify(applicationProperties, times(1)).getPort();
	}

	@Test
	@DisplayName("Application main method runs without exceptions")
	void applicationMainMethodRunsWithoutExceptions() {
		SpringApplication mockSpringApplication = mock(SpringApplication.class);
		Application.main(new String[]{});
	}

}
