package it.carmelolagamba.sbam.adapters.outbound.consumer;

public interface IConsumer<DTO> {

    /**
     * Consumes the provided DTO.
     * @param dto the DTO to consume
     */
    void consume(DTO dto);

    /**
     * Consumes the provided byte array.
     * @param data the byte array to consume
     */
    void consume(byte[] data);
}
