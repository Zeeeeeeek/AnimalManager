package it.unicam.cs.springboot.animals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractAnimal implements Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    protected AbstractAnimal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
