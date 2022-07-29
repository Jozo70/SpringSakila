package com.jhdev.SpringSakila.film.filmActor;

import javax.persistence.*;
import java.io.Serializable;

public class FilmActorKey {

    @Id
    @Column(name="film_id")
    private Integer filmId;

    @Id
    @Column(name="actor_id")
    private Integer ActorId;

    public FilmActorKey(Integer filmId, Integer ActorId) {
        this.filmId = filmId;
        this.ActorId = ActorId;
    }

    public FilmActorKey() {}

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer ActorId() {
        return ActorId;
    }

    public void setActorId(Integer ActorId) {
        this.ActorId = ActorId;
    }

}
