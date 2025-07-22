package it.carmelolagamba.sbam.adapters.dto.mapper;

public interface IMapper <DTO, INPUT_MODEL> {
    /**
     * Converts a Data Transfer Object (DTO) to an input model.
     *
     * @param dto the DTO to convert
     * @return the converted input model
     */
    INPUT_MODEL toInputModel(DTO dto);
}
