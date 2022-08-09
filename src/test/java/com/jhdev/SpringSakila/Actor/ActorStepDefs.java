package com.jhdev.SpringSakila.Actor;

import com.jhdev.SpringSakila.actor.Actor;
import com.jhdev.SpringSakila.actor.ActorDTO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorStepDefs {
    private String firstName;
    private String lastName;
    private ActorDTO actorDTO;
    private Actor actor;

    @Given("The Actors Name is Sammy Struggle")
    public void the_actors_name_is_sammy_struggle(){
        firstName = "Sammy";
        lastName = "Struggle";
    }
    @When("I Create a new actor called Sammy Struggle")
    public void i_create_a_new_actor_called_sammy_struggle(){
        actorDTO = new ActorDTO("Sammy", "Struggle");
        actor = new Actor(actorDTO);
    }

}
