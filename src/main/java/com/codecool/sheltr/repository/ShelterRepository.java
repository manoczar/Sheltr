package com.codecool.sheltr.repository;
import com.codecool.sheltr.model.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelterRepository extends JpaRepository <Shelter, Integer> {
}
