package it.carmelolagamba.springboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.carmelolagamba.springboot.command.SystemInfoCommand;
import it.carmelolagamba.springboot.resource.SystemResource;
import it.carmelolagamba.springboot.resource.assembler.SystemResourceAssembler;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@AllArgsConstructor
@RestController
@Tag(name = "System Information", description = "System Information")
public class SystemController {

    private final SystemInfoCommand systemInfoCommand;
    private final SystemResourceAssembler systemResourceAssembler;

    @Operation(summary = "Get system info")
    @RequestMapping(method = RequestMethod.GET, path = "/info")
    public ResponseEntity<SystemResource> info() {
        return ok(systemResourceAssembler.fromDto(systemInfoCommand.execute()));
    }

}
