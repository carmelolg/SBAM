package it.carmelolagamba.sbam.persistence.dao;

import it.carmelolagamba.sbam.persistence.entity.IEntity;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

class DAOFactoryTest {

    private DAOFactory daoFactory;

    @BeforeEach
    void setUp() {
        daoFactory = DAOFactory.getInstance();
    }

    @Test
    @DisplayName("Returns the same instance for multiple calls to getInstance")
    void returnsSameInstanceForMultipleCallsToGetInstance() {
        DAOFactory anotherInstance = DAOFactory.getInstance();
        assertSame(daoFactory, anotherInstance);
    }

    @Test
    @DisplayName("Throws exception when attempting to create a new instance via reflection")
    void throwsExceptionWhenCreatingNewInstanceViaReflection() {
        assertThrows(IllegalAccessException.class, () -> {
            DAOFactory.class.getDeclaredConstructor().newInstance();
        });
    }

    @Test
    @DisplayName("Throws NotImplementedException when getDAO is called")
    void throwsNotImplementedExceptionWhenGetDAOIsCalled() {
        IEntity<?> mockEntity = mock(IEntity.class);
        assertThrows(NotImplementedException.class, () -> daoFactory.getDAO(mockEntity));
    }
}