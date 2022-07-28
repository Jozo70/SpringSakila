package com.jhdev.SpringSakila.film;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int filmID;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private int releaseYear;

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
}
