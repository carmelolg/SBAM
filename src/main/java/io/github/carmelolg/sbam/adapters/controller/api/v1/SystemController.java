package io.github.carmelolg.sbam.adapters.controller.api.v1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.github.carmelolg.sbam.adapters.command.SystemInfoCommand;
import io.github.carmelolg.sbam.adapters.resource.SystemResource;
import io.github.carmelolg.sbam.adapters.resource.assembler.SystemResourceAssembler;
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
public class SystemController {

    private final SystemInfoCommand systemInfoCommand;
    private final SystemResourceAssembler systemResourceAssembler;

    @Operation(summary = "Get environment info")
    @RequestMapping(method = RequestMethod.GET, path = "/env/info")
    public ResponseEntity<SystemResource> info() {
        log.debug("Retrieving system information");
        return ok(systemResourceAssembler.fromDto(systemInfoCommand.execute()));
    }

}
