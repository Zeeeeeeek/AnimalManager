package it.unicam.cs.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

// Implement SpringBoot Application
@SpringBootApplication
public class App {

    // Main method
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}