package com.jhdev.SpringSakila.film.actor;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorController {
    private ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }


    //Get All Actors
    @GetMapping("/All_Actors")
    public @ResponseBody Iterable<Actor> getActors() {
        return actorRepository.findAll();
    }

    //Get Actor by ID
    @GetMapping("/Actor_By_ID")
    public @ResponseBody
    Actor getActorById(int actorID){
        return actorRepository.findById(actorID).orElseThrow();
    }

    ///Get Actor by First Name
    @GetMapping("/Actor_By_Name")
    Actor getActorByName(String firstName){
        return actorRepository.findByName(firstName);
    }
}
