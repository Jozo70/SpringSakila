package com.jhdev.SpringSakila.film.filmActor;

import org.springframework.web.bind.annotation.*;

@RestController //Will Handle the GET/POST/DELETE and PUT requests
@RequestMapping("/film_actor")
public class FilmActorController {
    private FilmActorRepository filmactorRepository;

    public FilmActorController(FilmActorRepository filmactorRepository) {
        this.filmactorRepository = filmactorRepository;
    }

    public FilmActorRepository getFilmActorRepository() {
        return filmactorRepository;
    }

    public void setFilmActorRepository(FilmActorRepository filmactorRepository){
        this.filmactorRepository = filmactorRepository;
    }

    //Create New Film Actor Entry :)

    @PostMapping("/Add_New_Film_Actor_Link")
    public @ResponseBody
    void addNewFilmActorLink(@RequestParam int filmId, @RequestParam int actorId){
        FilmActor fA = new FilmActor(filmId, actorId);
        filmactorRepository.save(fA);
    }
}
