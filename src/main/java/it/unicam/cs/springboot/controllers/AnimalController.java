package it.unicam.cs.springboot.controllers;

import it.unicam.cs.springboot.animals.AbstractAnimal;
import it.unicam.cs.springboot.services.AnimalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animals")
@RequiredArgsConstructor
@Slf4j
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping
    public String getAnimals() {
        return "P";
    }

    @PostMapping
    public String addAnimal(@RequestBody AbstractAnimal animal) {
        animal.doSomething();
        animalService.addAnimal(animal);
        return "P";
    }
}
