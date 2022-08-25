package com.jhdev.SpringSakila.category;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryID;


    //Attributes
    @Column(name = "name")
    private String catName;

    //@Column(name = "last_update")
    //private String lastUpdate;

    public Category(String catName){
        this.catName=catName;
    }
    public Category(){}

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    //public String getLastUpdate() {
    //    return lastUpdate;
    //}

    //public void setLastUpdate(String lastUpdate) {
    //    this.lastUpdate = lastUpdate;
    //}

}
