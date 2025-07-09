package it.carmelolagamba.springboot.resource.assembler;

import it.carmelolagamba.springboot.dto.SystemDTO;
import it.carmelolagamba.springboot.resource.SystemResource;
import org.springframework.stereotype.Component;

@Component
public class SystemResourceAssembler implements IAssembler<SystemResource, SystemDTO> {

    /**
     * Converts a Data Transfer Object (DTO) to a resource object.
     *
     * @param dto the DTO to convert
     * @return the converted resource object
     */
    @Override
    public SystemResource fromDto(SystemDTO dto) {
        return new SystemResource(dto.environment(), dto.description(), dto.port());
    }
}
