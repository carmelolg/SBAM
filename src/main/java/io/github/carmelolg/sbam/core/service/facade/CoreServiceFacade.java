package io.github.carmelolg.sbam.core.service.facade;

import io.github.carmelolg.sbam.adapters.dto.SystemDTO;
import io.github.carmelolg.sbam.core.service.SystemService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Facade for the component service in the SBAM application.
 * This class serves as a bridge between the controller and service layers,
 * encapsulating the logic for managing components.
 *
 * @Since 2.1
 * @Author carmelolg
 */
@Component
@AllArgsConstructor
public class CoreServiceFacade {
    private static final Logger log = LoggerFactory.getLogger(CoreServiceFacade.class);
    private final SystemService systemService;

    public SystemDTO getSystemInfo() {
        log.debug("Retrieving system information through CoreServiceFacade");
        return systemService.getSystemInfo();
    }

}
