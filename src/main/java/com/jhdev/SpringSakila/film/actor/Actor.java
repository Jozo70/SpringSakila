package com.jhdev.SpringSakila.film.actor;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jhdev.SpringSakila.film.Film;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private int actorID;

    @JsonIgnore
    @ManyToMany(mappedBy = "filmActor")
    List<Film> films = new ArrayList<>();

    public Actor(){}

    ///Attributes

    private String firstName,lastName;

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
