package it.carmelolagamba.springboot.command;

import it.carmelolagamba.springboot.dto.SystemDTO;
import it.carmelolagamba.springboot.service.SystemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SystemInfoCommand implements ICommand<SystemDTO> {

    private final SystemService systemService;

    @Override
    public SystemDTO execute() {
        return systemService.getSystemInfo();
    }
}
