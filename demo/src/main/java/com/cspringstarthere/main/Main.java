package com.cspringstarthere.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cspringstarthere.config.ProjectConfig;

import com.cspringstarthere.main.Parrot;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}