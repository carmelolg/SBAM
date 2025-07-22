package it.carmelolagamba.sbam.core.facade;

import it.carmelolagamba.sbam.core.domain.model.SystemOutputModel;
import it.carmelolagamba.sbam.core.service.SystemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@AllArgsConstructor
public class CoreServiceFacade {

    private final SystemService systemService;

    public SystemOutputModel getSystemInfo() {
        log.debug("Retrieving system information through ComponentServiceFacade");
        return systemService.getSystemInfo();
    }

}
