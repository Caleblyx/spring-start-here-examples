package com.cspringstarthere.config;

import org.springframework.beans.factory.config.BeanDefinition;
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
import org.springframework.context.annotation.Scope;


@Configuration
public class ProjectConfiguration {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService() {
        return new CommentService();
    }
}
    
