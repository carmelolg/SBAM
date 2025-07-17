package it.carmelolagamba.springboot.service;

import it.carmelolagamba.springboot.config.ApplicationProperties;
import it.carmelolagamba.springboot.config.EnvironmentProperties;
import it.carmelolagamba.springboot.dto.SystemDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class SystemService {

    private final EnvironmentProperties environmentProperties;
    private final ApplicationProperties applicationProperties;

     public SystemDTO getSystemInfo() {
         log.debug("Get system information from environment and application properties");
         return new SystemDTO(environmentProperties.getName(), environmentProperties.getDescription(), applicationProperties.getPort());
     }
}
