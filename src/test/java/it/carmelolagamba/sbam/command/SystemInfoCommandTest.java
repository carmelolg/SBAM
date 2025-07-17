package it.carmelolagamba.sbam.command;

import it.carmelolagamba.sbam.dto.SystemDTO;
import it.carmelolagamba.sbam.service.SystemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

class SystemInfoCommandTest {

    private SystemService systemService;
    private SystemInfoCommand systemInfoCommand;

    @BeforeEach
    void setUp() {
        systemService = mock(SystemService.class);
        systemInfoCommand = new SystemInfoCommand(systemService);
    }

    @Nested
    @DisplayName("execute method")
    class Execute {

        @Test
        @DisplayName("Returns system information successfully")
        void returnsSystemInformationSuccessfully() {
            SystemDTO expectedSystemInfo = new SystemDTO("Test Environment", "Test Description", 8080);
            when(systemService.getSystemInfo()).thenReturn(expectedSystemInfo);

            SystemDTO result = systemInfoCommand.execute();

            assertEquals(expectedSystemInfo, result);
            verify(systemService, times(1)).getSystemInfo();
        }

        @Test
        @DisplayName("Throws exception when systemService returns null")
        void throwsExceptionWhenSystemServiceReturnsNull() {
            when(systemService.getSystemInfo()).thenReturn(null);

            SystemDTO result = systemInfoCommand.execute();

            assertNull(result);
            verify(systemService, times(1)).getSystemInfo();
        }
    }
}