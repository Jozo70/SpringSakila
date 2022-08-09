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

    public Optional<Integer> getActorID(){
        return Optional.ofNullable(actorID);
    }

    public void setActorID(Integer actorID){
        this.actorID = actorID;
    }

    public Optional<String> getFirstName(){
        return Optional.ofNullable(firstName);
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public Optional<String> getLastName(){
        return Optional.ofNullable(lastName);
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
