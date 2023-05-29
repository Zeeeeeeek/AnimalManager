package it.unicam.cs.springboot.springboot.animals;

import it.unicam.cs.springboot.animals.Cat;
import org.junit.jupiter.api.Test;

class CatTest {

        @Test
        void testDoSomething() {
            Cat cat = new Cat("Tom");
            cat.getName();
            cat.doSomething();
        }
}
