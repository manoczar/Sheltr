package com.codecool.sheltr.service;


import com.codecool.sheltr.model.Shelter;
import com.codecool.sheltr.repository.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public String getCity(Integer id) {
        Shelter shelter = shelterRepository.findById(id).orElse(null);
        return shelter.getCity();
    }

    public void remove(Integer id) {
        Shelter shelter = shelterRepository.findById(id).orElse(null);
        shelterRepository.delete(shelter);

    }

}
