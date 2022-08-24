package com.jhdev.SpringSakila.actor;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends CrudRepository <Actor,Integer> {
    List<Actor> findByFirstName(String firstName);
    Actor findByFirstNameAndLastName(String firstName,String lastName);
    Actor findById(int actorID);

}
