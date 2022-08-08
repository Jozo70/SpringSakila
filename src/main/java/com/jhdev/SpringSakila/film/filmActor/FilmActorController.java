package com.jhdev.SpringSakila.film.filmActor;

import org.springframework.web.bind.annotation.*;

@RestController //Will Handle the GET/POST/DELETE and PUT requests
@RequestMapping("/film_actor")
public class FilmActorController {
    private FilmActorRepository filmActorRepository;

    public FilmActorController(FilmActorRepository filmActorRepository) {
        this.filmActorRepository = filmActorRepository;
    }

    public FilmActorRepository getFilmActorRepository() {
        return filmActorRepository;
    }

    public void setFilmActorRepository(FilmActorRepository filmActorRepository){
        this.filmActorRepository = filmActorRepository;
    }

    //Create New Film Actor Entry :)

    @PostMapping("/Add_New_Film_Actor_Link")
    public @ResponseBody
    void addNewFilmActorLink(@RequestParam int filmId, @RequestParam int actorId){
        FilmActor fA = new FilmActor(filmId, actorId);
        filmActorRepository.save(fA);
    }
}
