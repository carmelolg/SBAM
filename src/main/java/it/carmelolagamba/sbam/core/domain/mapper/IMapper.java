package it.carmelolagamba.sbam.core.domain.mapper;

public interface IMapper<MODEL, ENTITY> {

    /**
     * Converts a domain model to its corresponding entity.
     *
     * @param model the domain model to convert
     * @return the converted entity
     */
    ENTITY toEntity(MODEL model);

    /**
     * Converts an entity to its corresponding domain model.
     *
     * @param entity the entity to convert
     * @return the converted domain model
     */
    MODEL toModel(ENTITY entity);
}
