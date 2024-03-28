package com.cspringstarthere.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cspringstarthere.beans.Parrot;
import com.cspringstarthere.beans.Person;
import com.cspringstarthere.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot:" + person.getParrot());
    }
}