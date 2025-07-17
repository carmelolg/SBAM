package it.carmelolagamba.sbam.resource.assembler;

import it.carmelolagamba.sbam.dto.SystemDTO;
import it.carmelolagamba.sbam.resource.SystemResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SystemResourceAssembler implements IAssembler<SystemResource, SystemDTO> {

    /**
     * Converts a Data Transfer Object (DTO) to a resource object.
     *
     * @param dto the DTO to convert
     * @return the converted resource object
     */
    @Override
    public SystemResource fromDto(SystemDTO dto) {
        log.debug("Converting SystemDTO to SystemResource: {}", dto);
        return new SystemResource(dto.environment(), dto.description(), dto.port());
    }

    /**
     * Converts a resource object to a Data Transfer Object (DTO).
     *
     * @param systemResource the resource to convert
     * @return the converted DTO
     */
    @Override
    public SystemDTO toDto(SystemResource systemResource) {
        log.debug("Converting SystemResource to SystemDTO: {}", systemResource);
        return new SystemDTO(systemResource.environment(), systemResource.description(), systemResource.port());
    }
}
