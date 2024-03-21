package com.cspringstarthere.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cspringstarthere.config.Parrot;
import com.cspringstarthere.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        String s = context.getBean(String.class);
        Integer n = context.getBean(Integer.class);

        System.out.println(p.getName());
        System.out.println(s);
        System.out.println(n);
    }
}