package com.jhdev.SpringSakila.filmActor;

import javax.persistence.*;

import com.jhdev.SpringSakila.film.Film;
import com.jhdev.SpringSakila.actor.Actor;

@Entity
@Table(name = "film_actor")
//@IdClass(FilmActorKey.class) // Look@
public class FilmActor{ //implements Serializable {

    @EmbeddedId
    FilmActorKey ID;

    @ManyToOne
    @MapsId("filmID")
    @JoinColumn(name = "film_ID")
    Film film;

    @ManyToOne
    @MapsId("actorID")
    @JoinColumn(name = "actor_ID")
    Actor actor;

    //AUG23//@Id
    //AUG23//private int filmId;
    //AUG23//@Id
    //AUG23//private int actorId;

    public FilmActor(Film film, Actor actor){ //(int filmId, int actorId){
        this.film = film; //AUG23//filmId = filmId;
        this.actor = actor;// AUG23//actorId = actorId;
        ID = new FilmActorKey(film.getfilmID(),actor.getActorID());
    }

    public FilmActor(){}

    public FilmActorKey getID(){
        return ID;
    }

    public void setID(FilmActorKey ID){
        this.ID = ID;
    }

    //AUG23 BELOW//

    //public int getFilmId() {
    //    return filmId;
    //}

    //public void setFilmId(int filmId) {
    //    this.filmId = filmId;
    //}
    //public int getActorId() {
    //    return actorId;
    //}

    //public void setActorId(int actorId) {
    //    this.actorId = actorId;
    //}

}
