package com.jhdev.SpringSakila.actor;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository <Actor,Integer> {
    Actor findByFirstName(String firstName);
    Actor findByFullName(String fullName);
}
