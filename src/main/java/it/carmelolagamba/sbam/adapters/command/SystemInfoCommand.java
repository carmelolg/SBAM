package it.carmelolagamba.sbam.adapters.command;

import it.carmelolagamba.sbam.core.domain.model.SystemOutputModel;
import it.carmelolagamba.sbam.core.facade.CoreServiceFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class SystemInfoCommand implements ICommand<SystemOutputModel> {

    private final CoreServiceFacade componentServiceFacade;

    @Override
    public SystemOutputModel execute() {
        log.debug("Executing command to retrieve system information");
        return componentServiceFacade.getSystemInfo();
    }
}
