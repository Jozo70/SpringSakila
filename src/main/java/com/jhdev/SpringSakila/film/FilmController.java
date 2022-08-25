package com.jhdev.SpringSakila.film;

import com.jhdev.SpringSakila.actor.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired //Film Repo Link
    private final FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @GetMapping("/Get_Films")
    public @ResponseBody Iterable<Film> getFilms() {
        return filmRepository.findAll();
    }

    @PostMapping("/Add_New_Film")
    public @ResponseBody String addNewFilm(@RequestParam String title, @RequestParam String description, @RequestParam Integer release_year, @RequestParam Integer language_id,
                                           @RequestParam Integer originalLanguageId, @RequestParam Integer rental_duration,
                                           @RequestParam BigDecimal rental_rate, @RequestParam float length, @RequestParam BigDecimal replacement_cost,
                                           @RequestParam float rating, @RequestParam String special_features){
        Film film = new Film(title, description, release_year, language_id, originalLanguageId, rental_duration, rental_rate, length, replacement_cost, rating, special_features);
        filmRepository.save(film);
        return "saved";
    }

    @DeleteMapping("/Delete_Film_By_Id")
    public @ResponseBody
    void deleteFilmById(@RequestParam int filmID){
        filmRepository.deleteById(filmID);
    }

    @GetMapping("/Film_By_Title")
    public @ResponseBody
    Film getFilmTitle(@RequestParam String title){
        return filmRepository.findByTitle(title);
    }

}
