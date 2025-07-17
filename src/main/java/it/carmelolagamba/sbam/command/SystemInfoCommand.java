package it.carmelolagamba.sbam.command;

import it.carmelolagamba.sbam.dto.SystemDTO;
import it.carmelolagamba.sbam.service.SystemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class SystemInfoCommand implements ICommand<SystemDTO> {

    private final SystemService systemService;

    @Override
    public SystemDTO execute() {
        log.debug("Executing command to retrieve system information");
        return systemService.getSystemInfo();
    }
}
