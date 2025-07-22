package it.carmelolagamba.sbam.resource.assembler;

import it.carmelolagamba.sbam.dto.SystemDTO;
import it.carmelolagamba.sbam.resource.SystemResource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SystemResourceAssemblerTest {

    private final SystemResourceAssembler assembler = new SystemResourceAssembler();

    @Nested
    @DisplayName("fromDto method")
    class FromDto {

        @Test
        @DisplayName("Converts valid SystemDTO to SystemResource")
        void convertsValidSystemDTOToSystemResource() {
            SystemDTO dto = new SystemDTO("prod", "Production environment", 8080);

            SystemResource resource = assembler.fromDto(dto);

            assertEquals("prod", resource.environment());
            assertEquals("Production environment", resource.description());
            assertEquals(8080, resource.port());
        }

        @Test
        @DisplayName("Throws exception when SystemDTO is null")
        void throwsExceptionWhenSystemDTOIsNull() {
            assertThrows(NullPointerException.class, () -> assembler.fromDto(null));
        }
    }
}