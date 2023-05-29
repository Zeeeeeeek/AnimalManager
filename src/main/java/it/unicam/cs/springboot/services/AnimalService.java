package it.unicam.cs.springboot.services;

import it.unicam.cs.springboot.animals.AbstractAnimal;
import it.unicam.cs.springboot.repository.AbstractAnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AbstractAnimalRepository animalRepository;

    public void addAnimal(AbstractAnimal animal) {
        animalRepository.save(animal);
    }
}
