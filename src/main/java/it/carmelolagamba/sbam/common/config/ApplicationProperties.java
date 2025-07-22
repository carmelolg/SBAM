package it.carmelolagamba.sbam.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Getter @Setter
public class ApplicationProperties {

	@Value("${server.port}")
    private Integer port;

	private String version;
	private String name;
	private String description;

}
