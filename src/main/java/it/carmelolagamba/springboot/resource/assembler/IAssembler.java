package it.carmelolagamba.springboot.resource.assembler;

/**
 * Interface for assembling a resource from a Data Transfer Object (DTO).
 *
 * @param <RESOURCE> the type of the resource to be created
 * @param <DTO>      the type of the Data Transfer Object (DTO)
 * @Since 2.1
 * @Author carmelolg
 */
public interface IAssembler<RESOURCE, DTO> {
    /**
     * Converts a Data Transfer Object (DTO) to a resource object.
     *
     * @param dto the DTO to convert
     * @return the converted resource object
     */
    RESOURCE fromDto(DTO dto);
}
