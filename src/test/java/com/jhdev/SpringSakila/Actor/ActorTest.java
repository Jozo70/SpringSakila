package com.jhdev.SpringSakila.Actor;

import com.jhdev.SpringSakila.actor.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    private int actorID;
    private String firstName;
    private String lastName;

    @Test
    public void test_getFirstName(){
        ActorDTO actorDTO = new ActorDTO("Sammy","Struggle");
        Actor testActor = new Actor(actorDTO);
        assertEquals("Sammy",testActor.getFirstName(),"The First name is Incorrect.");
    }

    @Test
    public void test_setFirstName(){
        ActorDTO actorDTO = new ActorDTO("Sammy", "Struggle");
        Actor testActor = new Actor(ActorDTO);
        testActor.setFirstName("Jimbo");
        assertEquals("Jimbo", testActor.getFirstName(), "The First Name is an Unexpected Value.");
    }

}
