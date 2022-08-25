package com.jhdev.SpringSakila;

import com.jhdev.SpringSakila.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jhdev.SpringSakila.actor.Actor;
import com.jhdev.SpringSakila.actor.ActorRepository;
import com.jhdev.SpringSakila.film.Film;
import com.jhdev.SpringSakila.film.FilmRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3306")
@SpringBootApplication
@RestController
@RequestMapping("/Sakila")
public class SpringSakilaApplication {



	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private ActorRepository actorRepository;

	@Autowired
	private CategoryRepository categoryRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringSakilaApplication.class, args);
	}

	public SpringSakilaApplication(ActorRepository actorRepository, FilmRepository filmRepository, CategoryRepository categoryRepository){
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
	}

	//@GetMapping("/All_Films")
	//public @ResponseBody
	//Iterable<Film>getAllFilms(){
	//	return filmRepository.findAll();
	//}





}
