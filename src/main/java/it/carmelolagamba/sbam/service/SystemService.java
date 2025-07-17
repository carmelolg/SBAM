package it.carmelolagamba.sbam.service;

import it.carmelolagamba.sbam.config.ApplicationProperties;
import it.carmelolagamba.sbam.config.EnvironmentProperties;
import it.carmelolagamba.sbam.dto.SystemDTO;
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
