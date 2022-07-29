package com.jhdev.SpringSakila.film.filmActor;

import javax.persistence.*;
import java.io.Serializable;

public class FilmActorKey implements Serializable{

    @Id
    @Column(name="film_id")
    private Integer filmId;

    @Id
    @Column(name="actor_id")
    private Integer actorId;

    public FilmActorKey(Integer filmId, Integer actorId) {
        this.filmId = filmId;
        this.actorId = actorId;
    }

    public FilmActorKey() {}

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer actorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

}
