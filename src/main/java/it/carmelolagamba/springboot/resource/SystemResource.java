package it.carmelolagamba.springboot.resource;

import lombok.Getter;

/**
 * Resource Object for system information.
 * Contains details about the environment, application description, URL, and port.
 * @Since 2.1
 * @Author carmelolg
 */
public record SystemResource(
	String environment,
    String description,
    Integer port
){}
