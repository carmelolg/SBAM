package it.carmelolagamba.sbam.adapters.resource.assembler;

/**
 * Interface for assembling a resource from an output model (Domain Model).
 *
 * @param <RESOURCE> the type of the resource to be created
 * @param <OUTPUT_MODEL> the type of the Data Transfer Object (DTO)
 * @Since 2.1
 * @Author carmelolg
 */
public interface IAssembler<RESOURCE, OUTPUT_MODEL> {
    /**
     * Converts a Model to a resource object.
     *
     * @param outputModel the output model to convert
     * @return the converted resource object
     */
    RESOURCE fromModel(OUTPUT_MODEL outputModel);

}
