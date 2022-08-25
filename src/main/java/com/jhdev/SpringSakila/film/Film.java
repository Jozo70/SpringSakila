package com.jhdev.SpringSakila.film;
import com.jhdev.SpringSakila.filmActor.FilmActor;

import javax.persistence.*;
import java.util.*;
import java.math.BigDecimal;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int filmID;

    //AUG23//@ManyToMany
    //AUG23//@JoinTable(name = "film_actor",joinColumns = @JoinColumn(name = "film_id"),inverseJoinColumns = @JoinColumn(name = "actor_id"))
    //AUG23//List<Actor> filmActor = new ArrayList<>();

    @OneToMany(mappedBy = "film")
    Set<FilmActor> filmActors;


    ///Attributes
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "release_year")
    private Integer releaseYear;
    @Column(name = "language_id")
    private Integer languageId;
    @Column(name = "original_language_id")
    private Integer originalLanguageId;
    @Column(name = "rental_duration")
    private Integer rentalDuration;
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;
    @Column(name = "length")
    private float length;
    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;
    @Column(name = "rating")
    private float rating;
    @Column(name = "special_features")
    private String special_features;
    //private float lastUpdate;

    public Film(String title, String     description, Integer releaseYear, Integer languageId, Integer originalLanguageId,
                Integer rentalDuration, BigDecimal rentalRate, Float length, BigDecimal replacementCost,
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

    public Integer getfilmID() {
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
    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public Integer getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(int originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
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

    //public float getLastUpdate() {
    //    return lastUpdate;
    //}

    //public void setLastUpdate(float lastUpdate) {
    //    this.lastUpdate = lastUpdate;
    //}

    //public List<Actor> getFilmActor(){
    //    return filmActor;
    //}

    //public void setFilmActor(List<Actor> filmActor){
    //    this.filmActor = filmActor;
    //}
}
