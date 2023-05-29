package it.unicam.cs.springboot.animals;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Entity
@NoArgsConstructor
public class Cat extends AbstractAnimal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        log.info("Meow!");
    }
}
