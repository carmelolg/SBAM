package it.carmelolagamba.springboot.resource.assembler;

public interface IAssembler<RESOURCE, DTO> {
    /**
     * Converts a Data Transfer Object (DTO) to a resource object.
     *
     * @param dto the DTO to convert
     * @return the converted resource object
     */
    RESOURCE fromDto(DTO dto);
}
