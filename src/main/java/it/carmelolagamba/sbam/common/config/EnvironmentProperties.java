package it.carmelolagamba.sbam.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "environment")
@Getter
@Setter
public class EnvironmentProperties {
    private String name;
    private String description;
}
