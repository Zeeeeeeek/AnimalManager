package it.unicam.cs.springboot.animals;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@Entity
public class Dog extends AbstractAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        log.info("Woof!");
    }
}
