package com.jhdev.SpringSakila.film.actor;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface ActorRepository extends CrudRepository <Actor,Integer> {
    Actor findByFirstName(String firstName);
    Actor findByFullName(String fullName);
}
