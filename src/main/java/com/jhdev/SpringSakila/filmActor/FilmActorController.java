package com.jhdev.SpringSakila.filmActor;

import org.springframework.web.bind.annotation.*;
import com.jhdev.SpringSakila.actor.Actor;
import com.jhdev.SpringSakila.actor.ActorRepository;
import com.jhdev.SpringSakila.film.Film;
import com.jhdev.SpringSakila.film.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController //Will Handle the GET/POST/DELETE and PUT requests
@RequestMapping("/filmActors")
public class FilmActorController {

    @Autowired
    private final FilmRepository filmRepo;

    @Autowired
    private final ActorRepository actorRepo;

    @Autowired
    private FilmActorRepository filmActorRepo;

    //public FilmActorController(FilmActorRepository filmActorRepository) {
    //    this.filmActorRepository = filmActorRepository;
    //}

    public FilmActorController(FilmRepository filmRepo, ActorRepository actorRepo, FilmActorRepository filmActorRepo){
        this.filmRepo = filmRepo;
        this.actorRepo = actorRepo;
        this.filmActorRepo = filmActorRepo;
    }
    //AUG 24 FIX LATER
    //@GetMapping(params = {"actorFirst","actorLast"})
    //public @ResponseBody
    //List<Film> getFilmsByActor(@RequestParam(name = "actorFirst") String firstName,
    //                           @RequestParam(name = "actorLast") String lastName){
    //    Actor actor = actorRepo.findByFirstNameAndLastName(firstName,lastName);
    //    return filmRepo.findFilmsByActorID(actor.getActorID());
    //}

    //AUG 24th
    //@GetMapping(params = {"actorFull"})
    //public @ResponseBody
    //List<Film> getFilmsByActor(@RequestParam(name = "actorFull") String fullName){
    //    Actor actor = actorRepo.findByFullName(fullName);
    //    return filmRepo.findFilmsByActorID(actor.getActorID());
    //}

    //AUG23//
    //public FilmActorRepository getFilmActorRepository() {
    //    return filmActorRepository;
    //}
    //
    //public void setFilmActorRepository(FilmActorRepository filmActorRepository){
    //    this.filmActorRepository = filmActorRepository;
    //}

    //Create New Film Actor Entry :)      //old


    //AUG24//
    //@PostMapping("/Add_New_Film_Actor_Link")
    //public @ResponseBody
    //void addNewFilmActorLink(@RequestParam int filmId, @RequestParam int actorId){
    //    FilmActor fA = new FilmActor(filmId, actorId);
    //    filmActorRepository.save(fA);
    //}
}
