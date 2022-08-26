package com.jhdev.SpringSakila.category;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    Integer categoryID = 70;
    String catName = "Car Films";

    Category testCat = new Category();
    @BeforeEach
    void beforeAll(){
        testCat = new Category(catName);
    }

    @Test
    void getCategoryID() {
        assertEquals(categoryID,testCat.getCategoryID(), "Return Category ID.");
    }

    @Test
    void setCategoryID() {
        int expected = 70;
        testCat.setCategoryID(expected);
        assertEquals(expected,testCat.getCategoryID(), "Set Category ID.");
    }

    @Test
    void getCatName() {
        assertEquals(catName,testCat.getCatName(), "Return Category Name.");
    }

    @Test
    void setCatName() {
        String expected = "Car_Films";
        testCat.setCatName(expected);
        assertEquals(expected,testCat.getCatName(), "Set Category Name.");
    }
}