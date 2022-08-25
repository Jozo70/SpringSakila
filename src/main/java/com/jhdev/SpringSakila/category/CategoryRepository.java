package com.jhdev.SpringSakila.category;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CategoryRepository extends CrudRepository <Category,Integer> {

    //List<Category> getCatByName(String catName);

    //Category getCatByID(int catID);

}
