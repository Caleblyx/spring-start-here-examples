package com.cspringstarthere.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

    Person person;
    @Autowired
    Parrot(Person person) {
        this.person = person;
    }

    public Parrot() {
        System.out.println("Parrot created");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
