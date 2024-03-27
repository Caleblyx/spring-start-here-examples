package com.cspringstarthere.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Person {

    private String name = "Ella";
    
    private final Parrot parrot;

    @Autowired
    Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Parrot getParrot() {
        return parrot;
    }
}
