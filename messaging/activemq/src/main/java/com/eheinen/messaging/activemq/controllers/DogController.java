package com.eheinen.messaging.activemq.controllers;

import com.eheinen.messaging.activemq.models.Dog;
import com.eheinen.messaging.activemq.service.DogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @PostMapping
    public void createDog(@RequestBody Dog dog) {
        dogService.createDog(dog);
    }
}
