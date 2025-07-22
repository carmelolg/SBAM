package it.carmelolagamba.sbam.dto.mapper;

public interface IMapper<DTO, ENTITY> {

    /**
     * Converts a dto to its corresponding entity.
     *
     * @param model the dto to convert
     * @return the converted entity
     */
    ENTITY toEntity(DTO model);

    /**
     * Converts an entity to its corresponding dto
     *
     * @param entity the entity to convert
     * @return the converted dto
     */
    DTO toDto(ENTITY entity);
}
