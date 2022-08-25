package com.jhdev.SpringSakila.Actor;

import com.jhdev.SpringSakila.actor.*;
import com.jhdev.SpringSakila.film.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {

    ////// Test File for Addressing Gets and Sets for the Actor Entity \\\\\\\\\

    Integer actorID = 70;
    Set<Film> films = new HashSet<>();
    String firstName = "Ben";
    String lastName = "Dover";
    //String fullName = "Ben Dover";
    //String lastUpdate = "2022-08-20";

    Actor testActor = new Actor();
    @Test
    @BeforeEach
    void beforeAll(){
        Film film = new Film();
        films.add(film);
        testActor = new Actor(actorID, films, firstName, lastName);
    }
    @Test
    void test_getActorId(){
        assertEquals(actorID,testActor.getActorID(),"Returns Actor ID");
    }
    @Test
    void test_getFilms(){
        assertEquals(films,testActor.getFilms(),"Returns Actors Films");
    }
    @Test
    void test_getFirstName(){
        assertEquals(firstName,testActor.getFirstName(),"Returns Actors First Name");
    }
    @Test
    void test_getLastName(){
        assertEquals(lastName,testActor.getLastName(),"Returns Actors Last Name");
    }

    //@Test
    //void test_getFirstName(){
    //    ActorDTO actorDTO = new ActorDTO("Sammy","Struggle");
    //    Actor testActor = new Actor(actorDTO);
    //    testActor.setFirstName("Sammy");
    //    assertEquals("Sammy",testActor.getFirstName(),"The First name is Incorrect.");
    //}

    //@Test
    //void test_setFirstName(){
    //    ActorDTO actorDTO = new ActorDTO("Sammy", "Struggle");
    //    Actor testActor = new Actor(actorDTO);
    //    testActor.setFirstName("Jimbo");
    //    assertEquals("Jimbo", testActor.getFirstName(), "The First Name is an Unexpected Value.");
    //}

    //@Test
    //void test_getLastName(){
    //    ActorDTO actorDTO = new ActorDTO("Sammy", "Struggle");
    //    Actor testActor = new Actor(actorDTO);
    //    testActor.setLastName("Struggle");
    //    assertEquals("Struggle",testActor.getLastName(), "The Last Name is an Unexpected Value");
    //}

    //@Test
    //void test_setLastName(){
    //    ActorDTO actorDTO = new ActorDTO("Sammy","Struggle");
    //    Actor testActor = new Actor(actorDTO);
    //    testActor.setLastName("Sampson");
    //    assertEquals("Sampson",testActor.getLastName(),"The Last Name is an Unexpected Value");
    //}

}
