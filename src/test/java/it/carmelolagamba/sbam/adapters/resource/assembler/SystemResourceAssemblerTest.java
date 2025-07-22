package it.carmelolagamba.sbam.adapters.resource.assembler;

import it.carmelolagamba.sbam.adapters.resource.assembler.SystemResourceAssembler;
import it.carmelolagamba.sbam.core.domain.model.SystemOutputModel;
import it.carmelolagamba.sbam.adapters.resource.SystemResource;
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
            SystemOutputModel dto = new SystemOutputModel("prod", "Production environment", 8080);

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