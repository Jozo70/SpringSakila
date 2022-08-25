package com.jhdev.SpringSakila.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/All_Categories")
    public @ResponseBody Iterable<Category> getCategory() {
        return categoryRepository.findAll();
    }

    //@GetMapping("/Get_Cat_By_Name")
    //public @ResponseBody
    //Iterable<Category>getCatByName(@RequestParam String catName){
    //    return categoryRepository.getCatByName(catName);
    //}

    //@GetMapping("/Get_Category_By_ID")
    //public @ResponseBody
    //Category getCatByID(@RequestParam int categoryID){
    //    return categoryRepository.getCatByID(categoryID);
    //}
}
