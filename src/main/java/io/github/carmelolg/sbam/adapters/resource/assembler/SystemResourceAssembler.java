package io.github.carmelolg.sbam.adapters.resource.assembler;

import io.github.carmelolg.sbam.adapters.dto.SystemDTO;
import io.github.carmelolg.sbam.adapters.resource.SystemResource;
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

}
