package com.jhdev.SpringSakila.catagory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class CatagoryController {
    @Autowired
    private final CatagoryRepository catagoryRepository;

    public CatagoryController(CatagoryRepository catagoryRepository) {
        this.catagoryRepository = catagoryRepository;
    }

    @GetMapping
    public @ResponseBody Iterable<Catagory> getCatagory() {
        return catagoryRepository.findAll();
    }
}
