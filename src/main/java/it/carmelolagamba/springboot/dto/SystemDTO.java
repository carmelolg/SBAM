package it.carmelolagamba.springboot.dto;

/**
 * DTO class representing system information.
 * Contains details about the environment, application description, and port.
 */
public record SystemDTO(
        String environment,
        String description,
        Integer port
){}
