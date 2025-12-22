package it.carmelolagamba.sbam.service.facade;

import it.carmelolagamba.sbam.dto.SystemDTO;
import it.carmelolagamba.sbam.service.SystemService;
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
