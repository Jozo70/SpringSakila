package com.jhdev.SpringSakila.actor;


import com.jhdev.SpringSakila.filmActor.FilmActor;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "actor")
public class Actor {

    ////////                ATTRIBUTES                  \\\\\\\\\\
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actorID;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "actor")
    private Set<FilmActor> actFilms;

    public Actor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //this.fullName = fullName;
    }


    ////////              CONSTRUCTOR                \\\\\\\\\\
    public Actor(){}

    ////////                GET SETS                  \\\\\\\\\\
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
