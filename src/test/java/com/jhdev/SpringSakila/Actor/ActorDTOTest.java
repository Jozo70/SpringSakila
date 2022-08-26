package com.jhdev.SpringSakila.Actor;

import com.jhdev.SpringSakila.actor.Actor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorDTOTest {
    Integer actorID = 70;
    String firstName = "Ben";
    String lastName = "Dover";
    Actor testActor = new Actor();
    @BeforeEach
    void beforeAll(){
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