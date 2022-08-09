package com.jhdev.SpringSakila.actor;


import com.jhdev.SpringSakila.film.Film;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "actor")
public class Actor {

    ////////                ATTRIBUTES                  \\\\\\\\\\
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Formula("concat(first_name, ' ',last_name")
    private String fullName;
    public Actor(ActorDTO actorDTO){
        this.ID = actorDTO.getActorID();
        this.firstName = actorDTO.getFirstName();
        this.lastName = actorDTO.getLastName();
    }

    public Actor(){}

    //@JsonIgnore
    @ManyToMany
    @JoinTable(name="film_actor",
            joinColumns = @JoinColumn(name="actor_id"),
            inverseJoinColumns = @JoinColumn(name="film_id"))

    private List<Film> FilmList = new ArrayList<>();


    ////////                GET SETS                  \\\\\\\\\\

    public int getActorID() {
        return ID;
    }

    public void setActorID(int actorID) {
        this.ID = actorID;
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

    public String getFullName() {
        return fullName;
    }

    public List<Film> getFilmList(){
        return FilmList;
    }

    public void setFilmList(List<Film> FilmList){
        this.FilmList = FilmList;
    }

}
