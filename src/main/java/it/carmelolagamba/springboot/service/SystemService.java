package it.carmelolagamba.springboot.service;

import it.carmelolagamba.springboot.config.ApplicationProperties;
import it.carmelolagamba.springboot.dto.SystemDTO;
import it.carmelolagamba.springboot.resource.SystemResource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SystemService {

    private final ApplicationProperties config;

     public SystemDTO getSystemInfo() {
         return new SystemDTO(config.getEnvironment(), config.getDescription(), config.getPort());
     }
}
