package se.lexicon;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalesPersonTest {

    @Test
    public void createSalesPerson() {

        //Arrange
        String[] clients = {};
        String[] acquiredClients = {};
        SalesPerson newSalesPerson;

        //Act
        newSalesPerson = new SalesPerson(clients, acquiredClients);

        //Assert
        assertEquals(clients, newSalesPerson.getClients());
        assertEquals(acquiredClients, newSalesPerson.getAcquiredClients());

    }





}