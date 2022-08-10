package com.jhdev.SpringSakila.Actor;

import com.jhdev.SpringSakila.actor.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    private Integer actorID;
    private String firstName;
    private String lastName;

    @Test
    void test_getFirstName(){
        ActorDTO actorDTO = new ActorDTO("Sammy","Struggle");
        Actor testActor = new Actor(actorDTO);
        testActor.setFirstName("Sammy");
        assertEquals("Sammy",testActor.getFirstName(),"The First name is Incorrect.");
    }

    @Test
    void test_setFirstName(){
        ActorDTO actorDTO = new ActorDTO("Sammy", "Struggle");
        Actor testActor = new Actor(actorDTO);
        testActor.setFirstName("Jimbo");
        assertEquals("Jimbo", testActor.getFirstName(), "The First Name is an Unexpected Value.");
    }

    @Test
    void test_getLastName(){
        ActorDTO actorDTO = new ActorDTO("Sammy", "Struggle");
        Actor testActor = new Actor(actorDTO);
        testActor.setLastName("Struggle");
        assertEquals("Struggle",testActor.getLastName(), "The Last Name is an Unexpected Value");
    }

    @Test
    void test_setLastName(){
        ActorDTO actorDTO = new ActorDTO("Sammy","Struggle");
        Actor testActor = new Actor(actorDTO);
        testActor.setLastName("Sampson");
        assertEquals("Sampson",testActor.getLastName(),"The Last Name is an Unexpected Value");
    }

}
