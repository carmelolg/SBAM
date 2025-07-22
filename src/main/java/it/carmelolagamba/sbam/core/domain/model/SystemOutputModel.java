package it.carmelolagamba.sbam.core.domain.model;

/**
 * DTO class representing system information.
 * Contains details about the environment, application description, and port.
 * @Since 2.1
 * @Author carmelolg
 */
public record SystemOutputModel(
        String environment,
        String description,
        Integer port
){}
