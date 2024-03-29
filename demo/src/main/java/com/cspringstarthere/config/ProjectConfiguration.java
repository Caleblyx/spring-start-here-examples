package com.cspringstarthere.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.cspringstarthere.model.Comment;
@Configuration
@ComponentScan(basePackages = {"com.cspringstarthere.proxies", "com.cspringstarthere.services", "com.cspringstarthere.repositories"})
public class ProjectConfiguration {

}
