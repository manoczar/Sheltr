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
                    .city("Budapest")
                    .build();

            Shelter animall = Shelter.builder()
                    .title("AnimALL")
                    .shortDescription("We are the biggest animal shelter in Hungary, based in Jászfelsőszentgyörgy")
                    .description("At AnimALL as the name suggests, we accept every animal in our shelter. And you can adopt them as well. We currently have some pigs, hedgehogs, dogs, cats, mallards, an elephant and a tiger")
                    .organisation("AnimALL")
                    .city("Jászfelsőszentgyörgy")
                    .build();

            Shelter birdy = Shelter.builder()
                    .title("Birdy")
                    .shortDescription("Birdy is the most famous bird shelter in Hungary")
                    .description("We constantly searching for abandoned birds in Hungary, and we are open for adoptions as well. Please visit us at Budapest for the details and browse between our birds")
                    .organisation("Birdy")
                    .city("Budapest")
                    .build();


            shelterStorage.add(doggo);
            shelterStorage.add(animall);
            shelterStorage.add(birdy);
        };
    }


}
