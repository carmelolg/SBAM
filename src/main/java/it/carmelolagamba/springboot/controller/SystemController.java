package it.carmelolagamba.springboot.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.carmelolagamba.springboot.config.ApplicationProperties;
import it.carmelolagamba.springboot.dto.InfoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "System Information", description = "System Information")
public class SystemController {

	@Autowired
	private ApplicationProperties config;

	@Operation(summary = "Alive test")
	@RequestMapping(method = RequestMethod.GET, path = "/ping")
	public String ping() {
		return "pong";
	}

	@Operation(summary = "Get system info")
	@RequestMapping(method = RequestMethod.GET, path = "/info")
	public InfoDto info() {

		InfoDto infoDto = new InfoDto();

		infoDto.setEnvironment(config.getEnvironment());
		infoDto.setName(config.getName());
		infoDto.setUrl(config.getUrl());
		infoDto.setPort(config.getPort());

		return infoDto;
	}

}
