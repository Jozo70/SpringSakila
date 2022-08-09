package com.jhdev.SpringSakila.film.actor;

import java.util.Optional;

public class ActorDTO {
    private Integer actorID;
    private String firstName;
    private String lastName;
    private String fullName;

    public ActorDTO(Integer actorID, String firstName, String lastName, String fullName){
        this.actorID = actorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
    }

    public ActorDTO(){}

    public int getActorID(){              //Optional<Integer>
        return actorID;            //Optional.ofNullable(actorID)
    }

    public void setActorID(Integer actorID){
        this.actorID = actorID;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
