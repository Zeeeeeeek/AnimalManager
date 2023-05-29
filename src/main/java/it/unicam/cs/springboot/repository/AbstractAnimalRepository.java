package it.unicam.cs.springboot.repository;

import it.unicam.cs.springboot.animals.AbstractAnimal;
import org.springframework.data.repository.CrudRepository;

public interface AbstractAnimalRepository extends CrudRepository<AbstractAnimal, Long> {
}
