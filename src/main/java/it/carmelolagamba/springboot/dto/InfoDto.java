package it.carmelolagamba.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InfoDto {

	private String environment;
    private String name;
    private String url;
    private Integer port;

}
