package com.jhdev.SpringSakila.film.actor;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface ActorRepository extends CrudRepository <Actor,Integer> {

    Actor findByID(int actorID);
    Actor findByName(String firstName);
    List<Actor> findByFullName(String fullName);
}
