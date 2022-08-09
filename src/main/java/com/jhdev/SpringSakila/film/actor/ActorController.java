package com.jhdev.SpringSakila.film.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/actor")
public class ActorController {
    private final ActorRepository actorRepository;
    private static final String NOT_FOUND_STAT_MESS = "There is no Actor that exists with that ID.";
    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    ////////                    C R U D                    \\\\\\\\\\
    ////////                CREATE NEW ACTOR               \\\\\\\\\\
//    @PostMapping("/Add_New_Actor")
//    public @ResponseBody
//    void addNewActor(@RequestBody ActorDTO actorDTO){
//        Actor a = new Actor(actorDTO);
//        actorRepository.save(a);
//    }

    ////////                GET ALL ACTORS                 \\\\\\\\\\
    @GetMapping("/All_Actors")
    public @ResponseBody Iterable<Actor> getActors() {
        return actorRepository.findAll();
    }

    ////////                GET ACTOR BY ID                 \\\\\\\\\\
    @GetMapping("/Actor_By_ID")
    public @ResponseBody
    Actor getActorById(@RequestParam int actorID){
        if (!actorRepository.findById(actorID).isEmpty()){
            return actorRepository.findById(actorID).get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,NOT_FOUND_STAT_MESS); //return actorRepository.findById(actorID).orElseThrow();
        }
    }

    ////////             GET ACTOR BY FULL NAME              \\\\\\\\\\
    @GetMapping("/Actor_By_Full_Name")
    public @ResponseBody
    Actor getActorByFullName(@RequestParam String fullName){
        return actorRepository.findByFullName(fullName);
    }
    ////////             GET ACTOR BY FIRST NAME             \\\\\\\\\\
    @GetMapping("/Actor_By_First_Name")
    Actor getActorByName(@RequestParam String firstName){
        return actorRepository.findByName(firstName);
    }
}
