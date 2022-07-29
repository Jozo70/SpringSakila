package com.jhdev.SpringSakila.film.actor;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository <Actor,Integer> {

    Actor findByID(int actorID);
    Actor findByName(String firstName);

}
