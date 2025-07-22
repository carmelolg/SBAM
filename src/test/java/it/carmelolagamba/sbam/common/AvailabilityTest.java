package it.carmelolagamba.sbam.common;

import static org.springframework.boot.availability.LivenessState.CORRECT;
import static org.springframework.boot.availability.ReadinessState.ACCEPTING_TRAFFIC;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class AvailabilityTest {

	@Autowired
	private ApplicationAvailability applicationAvailability;

	@Test
	public void testAvailability() {

		assert applicationAvailability.getLivenessState().equals(CORRECT) : "Application is not available";

		assert applicationAvailability.getReadinessState().equals(ACCEPTING_TRAFFIC) : "Application is not ready to accept traffic";

		assert applicationAvailability.getState(ReadinessState.class).equals(ACCEPTING_TRAFFIC) : "Application is not ready";

		log.info("Application availability tests passed.");
	}

}
