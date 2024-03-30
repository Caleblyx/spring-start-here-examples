package com.cspringstarthere.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.cspringstarthere.model.Comment;
import com.cspringstarthere.proxies.CommentNotificationProxy;
import com.cspringstarthere.proxies.EmailCommentNotificationProxy;
import com.cspringstarthere.repositories.CommentRepository;
import com.cspringstarthere.repositories.DBCommentRepository;
import com.cspringstarthere.services.CommentService;
@Configuration
@ComponentScan(basePackages = {"com.cspringstarthere.repositories", "com.cspringstarthere.services"})
public class ProjectConfiguration {

}
    
