package it.carmelolagamba.sbam.persistence.dao;

import it.carmelolagamba.sbam.persistence.entity.IEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;

@Slf4j
public class DAOFactory {

    /**
     * Singleton instance of DAOFactory.
     */
    private static volatile DAOFactory instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     * This ensures that the DAOFactory is a singleton.
     */
    private DAOFactory() {
        if (instance != null) {
            throw new IllegalStateException("Singleton already instantiated. Use getInstance() to access the DAOFactory.");
        }
    }

    /**
     * Returns the singleton instance of DAOFactory.
     * This method uses double-checked locking to ensure thread safety and lazy initialization.
     *
     * @return the singleton instance of DAOFactory
     */
    public static DAOFactory getInstance() {
        if (instance == null) {
            synchronized (DAOFactory.class) {
                if (instance == null) {
                    instance = new DAOFactory();
                }
            }
        }
        return instance;
    }

    /**
     * Returns a DAO instance for the specified entity.
     * This method uses reflection to create an instance of the DAO class associated with the entity.
     *
     * @param entity the entity for which to get the DAO
     * @param <T>    the type of the DAO, which must extend JPARepository or a similar interface
     * @return an instance of the DAO for the specified entity
     * TODO In order to use this template please extend a more specific type for T, such as JPARepository<IEntity<?>, ?>, to ensure the correct usage.
     */
    public <T> T getDAO(IEntity<?> entity) {
        log.debug("getDAO called for entity: {}", entity.getClass().getName());
        throw new NotImplementedException("getDAO(IEntity<?>) not implemented yet. Please extend a more specific type for T, such as JPARepository<IEntity<?>, ?>, to ensure the correct usage.");
    }
}
