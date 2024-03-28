package com.cspringstarthere.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Person {

    private String name = "Ella";
    private final Parrot parrot;
    
    public Person(Parrot parrot2) {
        this.parrot = parrot2;
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
