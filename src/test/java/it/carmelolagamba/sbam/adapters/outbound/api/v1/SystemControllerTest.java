package it.carmelolagamba.sbam.adapters.outbound.api.v1;

import it.carmelolagamba.sbam.adapters.resource.SystemResource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SystemControllerTest {

    @Autowired
    private SystemController systemController;

    @Test
    void info_ReturnsSystemResource() {
        ResponseEntity<SystemResource> response = systemController.info();
        SystemResource systemResource = response.getBody();

        // Basic assertions, adapt as needed
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(systemResource);
        assertNotNull(systemResource.environment());
        assertNotNull(systemResource.description());
        assertTrue(systemResource.port() > 0);
    }
}
