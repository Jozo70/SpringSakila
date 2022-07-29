package com.jhdev.SpringSakila.film;

import com.jhdev.SpringSakila.film.actor.Actor;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int filmID;

    @ManyToMany
    @JoinTable(name = "film_actor",joinColumns = @JoinColumn(name = "film_id"),inverseJoinColumns = @JoinColumn(name = "actor_id"))
    List<Actor> filmActor = new ArrayList<>();

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private int releaseYear;

    @Column(name = "language_id")
    private int languageId;

    @Column(name = "original_language_id")
    private int originalLanguageId;

    @Column(name = "rental_duration")
    private int rentalDuration;

    @Column(name = "rental_rate")
    private float rentalRate;

    @Column(name = "length")
    private float length;

    @Column(name = "replacement_cost")
    private float replacementCost;

    @Column(name = "rating")
    private float rating;

    @Column(name = "special_features")
    private float special_features;

    @Column(name = "last_update")
    private float lastUpdate;

    public Film(){}

    public int getfilmID() {
        return filmID;
    }

    public void setfilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getFilmTitle() {
        return  title;
    }

    public void SetFilmTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(int originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public float getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(float rentalRate) {
        this.rentalRate = rentalRate;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(float special_features) {
        this.special_features = special_features;
    }

    public float getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(float lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
