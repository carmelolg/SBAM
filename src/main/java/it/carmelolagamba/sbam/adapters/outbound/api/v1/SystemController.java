package it.carmelolagamba.sbam.adapters.outbound.api.v1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.carmelolagamba.sbam.adapters.command.SystemInfoCommand;
import it.carmelolagamba.sbam.adapters.resource.SystemResource;
import it.carmelolagamba.sbam.adapters.resource.assembler.SystemResourceAssembler;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@AllArgsConstructor
@RestController
@Tag(name = "System Information", description = "System Information")
@Slf4j
public class SystemController implements IRestController {

    private final SystemInfoCommand systemInfoCommand;
    private final SystemResourceAssembler systemResourceAssembler;

    @Operation(summary = "Get environment info")
    @RequestMapping(method = RequestMethod.GET, path = "/env/info")
    public ResponseEntity<SystemResource> info() {
        log.debug("Retrieving system information");
        return ok(systemResourceAssembler.fromDto(systemInfoCommand.execute()));
    }

}
