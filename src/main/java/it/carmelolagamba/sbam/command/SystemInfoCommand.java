package it.carmelolagamba.sbam.command;

import it.carmelolagamba.sbam.dto.SystemDTO;
import it.carmelolagamba.sbam.service.SystemService;
import it.carmelolagamba.sbam.service.facade.CoreServiceFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class SystemInfoCommand implements ICommand<SystemDTO> {

    private final CoreServiceFacade coreServiceFacade;

    @Override
    public SystemDTO execute() {
        log.debug("Executing command to retrieve system information");
        return coreServiceFacade.getSystemInfo();
    }
}
