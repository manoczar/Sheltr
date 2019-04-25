package com.codecool.sheltr.controller;


import com.codecool.sheltr.model.Shelter;
import com.codecool.sheltr.service.ShelterStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/")
public class ShelterController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ShelterStorage shelterStorage;

    @GetMapping(value={"/shelters", ""})
    public List<Shelter> shelterList() {
        return shelterStorage.getAll();
    }

    @GetMapping(value = "/shelters/{id}")
    public Shelter findById(@PathVariable("id") Integer id) {
        Shelter shelter = shelterStorage.find(id);
        return shelter;
    }



}
