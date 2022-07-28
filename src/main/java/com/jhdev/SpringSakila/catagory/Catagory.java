package com.jhdev.SpringSakila.catagory;

import javax.persistence.*;

@Entity
@Table(name = "catagory")
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catagory_id")
    private int catagoryID;

    @Column(name = "name")
    private String catName;

    @Column(name = "last_update")
    private String lastUpdate;

    public Catagory(){}

    public int getCatagoryID() {
        return catagoryID;
    }

    public void setCatagoryID(int catagoryID) {
        this.catagoryID = catagoryID;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
