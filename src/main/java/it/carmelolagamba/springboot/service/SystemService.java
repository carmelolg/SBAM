package it.carmelolagamba.springboot.service;

import it.carmelolagamba.springboot.config.ApplicationProperties;
import it.carmelolagamba.springboot.config.EnvironmentProperties;
import it.carmelolagamba.springboot.dto.SystemDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SystemService {

    private final EnvironmentProperties environmentProperties;
    private final ApplicationProperties applicationProperties;

     public SystemDTO getSystemInfo() {
         return new SystemDTO(environmentProperties.getName(), environmentProperties.getDescription(), applicationProperties.getPort());
     }
}
