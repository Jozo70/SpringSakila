package com.jhdev.SpringSakila.filmActor;

//import javax.persistence.Column;
import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class FilmActorKey implements Serializable{

    //@Id
    @Column(name="film_id")
    private int filmId;

    //@Id
    @Column(name="actor_id")
    private int actorId;

    public FilmActorKey(int filmId, int actorId) {
        this.filmId = filmId;
        this.actorId = actorId;
    }

    //public FilmActorKey() {} //EMPTY CONSTRUCTOR 24TH AUG

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

}
