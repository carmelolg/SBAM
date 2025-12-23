package io.github.carmelolg.sbam.core.service;

import io.github.carmelolg.sbam.common.config.ApplicationProperties;
import io.github.carmelolg.sbam.common.config.EnvironmentProperties;
import io.github.carmelolg.sbam.adapters.dto.SystemDTO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SystemService {

    private static final Logger log = LoggerFactory.getLogger(SystemService.class);

    private final EnvironmentProperties environmentProperties;
    private final ApplicationProperties applicationProperties;

     public SystemDTO getSystemInfo() {
         log.debug("Get system information from environment and application properties");
         return new SystemDTO(environmentProperties.getName(), environmentProperties.getDescription(), applicationProperties.getPort());
     }
}
