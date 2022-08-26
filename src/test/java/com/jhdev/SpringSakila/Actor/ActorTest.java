package com.jhdev.SpringSakila.Actor;

import com.jhdev.SpringSakila.actor.Actor;
import com.jhdev.SpringSakila.film.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActorTest {
    ////// Test File for Addressing Gets and Sets for the Actor Entity \\\\\\\\\

    Integer actorID = 70;
    //Set<Film> films = new HashSet<>();
    String firstName = "Ben";
    String lastName = "Dover";
    //String fullName = "Ben Dover";
    //String lastUpdate = "2022-08-20";
    Actor testActor = new Actor();
    @BeforeEach
    void beforeAll(){
        //Film film = new Film();
        //films.add(film);
        testActor = new Actor(firstName,lastName);
    }

    @Test
    void getActorID() {
        assertEquals(actorID,testActor.getActorID(), "Retrun Actor ID.");
    }

    @Test
    void setActorID() {
        int expected = 70;
        testActor.setActorID(expected);
        assertEquals(expected,testActor.getActorID(), "Set Actor ID.");
    }

    @Test
    void getFirstName() {
        assertEquals(firstName,testActor.getFirstName(), "Return Actors First Name.");
    }

    @Test
    void setFirstName() {
        String expected = "Ben";
        testActor.setFirstName(expected);
        assertEquals(expected,testActor.getFirstName(), "Set Actors First Name.");
    }

    @Test
    void getLastName() {
        assertEquals(lastName,testActor.getLastName(), "Return Actors Last Name.");
    }

    @Test
    void setLastName() {
        String expected = "Dover";
        testActor.setLastName(expected);
        assertEquals(expected,testActor.getLastName(), "Set Actors Last Name.");
    }
}