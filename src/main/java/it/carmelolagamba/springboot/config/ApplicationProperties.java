package it.carmelolagamba.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties
@Getter @Setter
public class ApplicationProperties {
  
	private String environment;
	private String name;
    private String url;

	@Value("${server.port}")
    private Integer port;
}
