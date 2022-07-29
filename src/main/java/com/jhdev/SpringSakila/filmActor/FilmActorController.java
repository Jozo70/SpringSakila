package com.jhdev.SpringSakila.filmActor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film_actor")
public class FilmActorController {
    @Autowired
    private final FilmActorRepository filmactorRepository;

    public FilmActorController(FilmActorRepository filmactorRepository) {
        this.filmactorRepository = filmactorRepository;
    }

    @GetMapping
    public @ResponseBody Iterable<FilmActor> getFilmActors() {
        return filmactorRepository.findAll();
    }
}
