package it.carmelolagamba.springboot.command;

public interface ICommand<DTO> {
    DTO execute();
}
