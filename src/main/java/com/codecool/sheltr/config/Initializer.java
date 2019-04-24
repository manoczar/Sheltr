package com.codecool.sheltr.config;

import com.codecool.sheltr.model.Shelter;
import com.codecool.sheltr.service.ShelterStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initializer {

    @Autowired
    ShelterStorage shelterStorage;

    @Bean
    CommandLineRunner init() {

        return args -> {

            Shelter doggo = Shelter.builder()
                    .title("Doggo shelter")
                    .shortDescription("We are a small dog shelter in Budapest")
                    .description("Doggo shelter is a small animal shelter based in Budapest. Currently we can only work with dogs due to our funds. We are easy to reach within the city and our team will more than happy to hel our future customers")
                    .organisation("Doggo kft.")
                    .build();


            shelterStorage.add(doggo);
        };
    }


}
