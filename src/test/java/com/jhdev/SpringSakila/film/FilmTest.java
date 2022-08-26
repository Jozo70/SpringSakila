//package com.jhdev.SpringSakila.film;
//
//import com.jhdev.SpringSakila.actor.Actor;
//import com.jhdev.SpringSakila.film.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class FilmTest {
//
//    Integer filmID = 70;
//    String title = "Fast N Furious 20";
//    String description = "Dom Toretto is Back and this time Its all about Family......";
//    Integer releaseYear = 2023;
//    Integer languageId = 1;
//    Integer originalLanguageId = 1;
//    Integer rentalDuration = 2;
//    Integer rentalRate = 1;
//    Integer length = 2;
//    Integer replacementCost = 20;
//    Integer rating = 2;
//    String special_features = "none lol";
//
//    Film testFilm = new Film();
//    @BeforeEach
//    void beforeAll(){
//        //testFilm = new Film(title,description,releaseYear,languageId,originalLanguageId,rentalDuration,rentalRate,length,replacementCost,rating,special_features);
//    }
//
//    @Test
//    void getfilmID() {
//        assertEquals(filmID,testFilm.getfilmID(), "Return Film ID.");
//    }
//
//    @Test
//    void setfilmID() {
//        int expected = 70;
//        testFilm.setfilmID(expected);
//        assertEquals(expected,testFilm.getfilmID(), "Set Film ID.");
//    }
//
//    @Test
//    void getFilmTitle() {
//        assertEquals(title,testFilm.getFilmTitle(), "Return Film Title.");
//    }
//
//    @Test
//    void setFilmTitle() {
//        String expected = "Fast N Furious 20";
//        testFilm.setFilmTitle(expected);
//        assertEquals(expected,testFilm.getFilmTitle(), "Set Film ID.");
//    }
//
//    @Test
//    void getDescription() {
//        assertEquals(description,testFilm.getDescription(), "Return Film Description.");
//    }
//
//    @Test
//    void setDescription() {
//        String expected = "Dom Toretto is Back and this time Its all about Family......";
//        testFilm.setDescription(expected);
//        assertEquals(expected,testFilm.getDescription(), "Set Films Description.");
//    }
//
//    @Test
//    void getReleaseYear() {
//        assertEquals(releaseYear,testFilm.getReleaseYear(), "Return Film Release Year.");
//    }
//
//    @Test
//    void setReleaseYear() {
//        int expected = 2023;
//        testFilm.setReleaseYear(expected);
//        assertEquals(expected,testFilm.getReleaseYear(), "Set Films Release Year.");
//    }
//
//    @Test
//    void getLanguageId() {
//        assertEquals(languageId,testFilm.getLanguageId(), "Return Films Language ID.");
//    }
//
//    @Test
//    void setLanguageId() {
//        int expected = 1;
//        testFilm.setLanguageId(expected);
//        assertEquals(expected,testFilm.getLanguageId(), "Set Films Language ID.");
//    }
//
//    @Test
//    void getOriginalLanguageId() {
//        assertEquals(originalLanguageId,testFilm.getOriginalLanguageId(), "Return Films Original Language ID.");
//    }
//
//    @Test
//    void setOriginalLanguageId() {
//        int expected = 1;
//        testFilm.setOriginalLanguageId(expected);
//        assertEquals(expected,testFilm.getOriginalLanguageId(), "Set Films Original language ID.");
//    }
//
//    @Test
//    void getRentalDuration() {
//        assertEquals(rentalDuration,testFilm.getRentalDuration(), "Returns The Duration on which a film could be rented.");
//    }
//
//    @Test
//    void setRentalDuration() {
//        int expected = 2;
//        testFilm.setRentalDuration(expected);
//        assertEquals(expected,testFilm.getRentalDuration(), "Set Films Rental Duration.");
//    }
//
//    @Test
//    void getRentalRate() {
//        testFilm.setRentalRate(BigDecimal.valueOf(10.99));
//        assertEquals(BigDecimal.valueOf(10.99), testFilm.getRentalRate(), "Mismatch");
//    }
//
//    @Test
//    void setRentalRate() {
//        testFilm.setRentalRate(BigDecimal.valueOf(10.99));
//        assertEquals(BigDecimal.valueOf(10.99),testFilm.getRentalRate(), "Set Films Rate.");
//    }
//
//    @Test
//    void getLength() {
//        assertEquals(length, Optional.of(testFilm.getLength()), "Return Films Runtime Length");
//    }
//
//    @Test
//    void setLength() {
//        int expected = 2;
//        testFilm.setLength(expected);
//        assertEquals(expected,testFilm.getLength(), "Set Films Runtime Length.");
//    }
//
//    @Test
//    void getReplacementCost() {
//        assertEquals(replacementCost,testFilm.getReplacementCost(), "Return Films Replacement cost");
//    }
//
//    @Test
//    void setReplacementCost() {
//        testFilm.setReplacementCost(BigDecimal.valueOf(10.99));
//        assertEquals(BigDecimal.valueOf(10.99), testFilm.getReplacementCost(), "Mismatch");
//    }
//
//    @Test
//    void getRating() {
//        //assertEquals(rating,testFilm.getRating(), "Return Films Rating.");
//    }
//
//    @Test
//    void setRating() {
//        int expected = 2;
//        testFilm.setRating(expected);
//        assertEquals(expected,testFilm.getRating(), "Set Films Rating.");
//    }
//
//    @Test
//    void getSpecial_features() {
//        assertEquals(special_features,testFilm.getSpecial_features(), "Returns the special features of the film, if any.");
//    }
//
//    @Test
//    void setSpecial_features() {
//        String expected = "none lol";
//        testFilm.setSpecial_features(expected);
//        assertEquals(expected,testFilm.getSpecial_features(), "Set Films Special Features.");
//    }
//}