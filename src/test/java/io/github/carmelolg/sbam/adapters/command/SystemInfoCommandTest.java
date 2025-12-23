package io.github.carmelolg.sbam.adapters.command;

import io.github.carmelolg.sbam.adapters.dto.SystemDTO;
import io.github.carmelolg.sbam.core.service.facade.CoreServiceFacade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

class SystemInfoCommandTest {

    private CoreServiceFacade coreServiceFacade;
    private SystemInfoCommand systemInfoCommand;

    @BeforeEach
    void setUp() {
        coreServiceFacade = mock(CoreServiceFacade.class);
        systemInfoCommand = new SystemInfoCommand(coreServiceFacade);
    }

    @Nested
    @DisplayName("execute method")
    class Execute {

        @Test
        @DisplayName("Returns system information successfully")
        void returnsSystemInformationSuccessfully() {
            SystemDTO expectedSystemInfo = new SystemDTO("Test Environment", "Test Description", 8080);
            when(coreServiceFacade.getSystemInfo()).thenReturn(expectedSystemInfo);

            SystemDTO result = systemInfoCommand.execute();

            assertEquals(expectedSystemInfo, result);
            verify(coreServiceFacade, times(1)).getSystemInfo();
        }

        @Test
        @DisplayName("Throws exception when systemService returns null")
        void throwsExceptionWhenSystemServiceReturnsNull() {
            when(coreServiceFacade.getSystemInfo()).thenReturn(null);

            SystemDTO result = systemInfoCommand.execute();

            assertNull(result);
            verify(coreServiceFacade, times(1)).getSystemInfo();
        }
    }
}