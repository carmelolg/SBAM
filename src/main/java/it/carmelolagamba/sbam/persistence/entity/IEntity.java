package it.carmelolagamba.sbam.persistence.entity;

/**
 * IEntity interface represents a generic entity with a unique identifier.
 * It provides methods to get and set the identifier, and to return a string representation of the entity.
 *
 * @param <T> the type of the unique identifier
 */
public interface IEntity<T> {
    /**
     * Returns the unique identifier of the entity.
     *
     * @return the unique identifier of the entity
     */
    T getId();

    /**
     * Sets the unique identifier of the entity.
     *
     * @param id the unique identifier to set
     */
    void setId(T id);

    /**
     * Returns a string representation of the entity.
     *
     * @return a string representation of the entity
     */
    String toString();

}
