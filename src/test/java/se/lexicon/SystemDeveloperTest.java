package se.lexicon;

import org.junit.Test;

import static org.junit.Assert.*;

public class SystemDeveloperTest {

    @Test
    public void calculateSalary() {

        //Arrange

        //Act

        //Assert
    }

    @Test
    public void createSystemDeveloper() {

        //Arrange
        String[] johnCertificates = {};
        String[] johnLanguages = {};
        SystemDeveloper newDeveloper = new SystemDeveloper("John Doe", johnCertificates, );

        String expectedFirstName = "Leo";
        String expectedLastName = "de Alcantara";
        //Act

        newPerson = new Person("Leo", "de Alcantara");

        //Assert
        assertEquals(expectedFirstName, newPerson.getFirstName());
        assertEquals(expectedLastName, newPerson.getLastName());

    }


}