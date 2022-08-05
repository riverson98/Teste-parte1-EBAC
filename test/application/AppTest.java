package application;

import model.entities.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static model.entities.Person.filterBySex;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void shoulderReturnOnlyWomanInTheList(){

        var p1 = new Person("Riverson","Masculino");
        var p2 = new Person("Mayara","feminino");
        var p3 = new Person("Renato","Masculino");
        var p4 = new Person("Rita","feminino");

        List<Person> people = List.of(p1,p2,p3,p4);
        List<Person> peopleWomans = List.of(p2,p4);

        List<Person> womans = filterBySex("F", people);

        assertEquals(peopleWomans,womans);
        assertNotEquals(peopleWomans,people);

    }

}