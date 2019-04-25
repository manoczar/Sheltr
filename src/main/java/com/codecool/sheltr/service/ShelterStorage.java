package com.codecool.sheltr.service;


import com.codecool.sheltr.model.Shelter;
import com.codecool.sheltr.repository.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ShelterStorage {

    @Autowired
    ShelterRepository shelterRepository;

    public void add(Shelter shelter){
        shelterRepository.save(shelter);
    }

    public Shelter find(Integer id) {
        return shelterRepository.findById(id).orElse(null);
    }

    public List<Shelter> getAll() {
        return shelterRepository.findAll();
    }

    public Stream<Shelter> getBy(String title) {
        List<Shelter> data = shelterRepository.findAll();
        return data.stream().filter(p -> p.getTitle().equals(title));
    }

    public String getCity(Integer id) {
        Shelter shelter = shelterRepository.findById(id).orElse(null);
        return shelter.getCity();
    }

}
