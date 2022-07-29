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

    ///Attributes
    private String title;
    private String description;
    private int releaseYear;
    private int languageId;
    private int originalLanguageId;
    private int rentalDuration;
    private double rentalRate;
    private float length;
    private float replacementCost;
    private float rating;
    private String special_features;
    private float lastUpdate;

    public Film(String title, String description, Integer releaseYear, Integer languageId, Integer originalLanguageId,
                Integer rentalDuration, Double rentalRate, Float length, Float replacementCost,
                Float rating, String specialFeatures) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
        this.originalLanguageId = originalLanguageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.special_features = specialFeatures;
    }

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

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
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

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public float getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(float lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Actor> getFilmActor(){
        return filmActor;
    }

    public void setFilmActor(List<Actor> filmActor){
        this.filmActor = filmActor;
    }
}
