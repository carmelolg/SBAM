package it.carmelolagamba.springboot.dto;

/**
 * DTO class representing system information.
 * Contains details about the environment, application description, and port.
 * @Since 2.1
 * @Author carmelolg
 */
public record SystemDTO(
        String environment,
        String description,
        Integer port
){}
