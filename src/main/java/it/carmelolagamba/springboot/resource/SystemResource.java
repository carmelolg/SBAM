package it.carmelolagamba.springboot.resource;

/**
 * Resource Object for system information.
 * Contains details about the environment, application description, URL, and port.
 */
public record SystemResource(
	String environment,
    String description,
    Integer port
){}
