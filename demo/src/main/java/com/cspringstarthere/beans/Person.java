package com.cspringstarthere.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Person {

    private String name = "Ella";
   
    private Parrot parrot;

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
    public String getName() {
        return name;
    }
    public Parrot getParrot() {
        return parrot;
    }
}
