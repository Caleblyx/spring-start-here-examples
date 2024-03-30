package com.cspringstarthere.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cspringstarthere.config.ProjectConfiguration;
import com.cspringstarthere.model.Comment;
import com.cspringstarthere.proxies.EmailCommentNotificationProxy;
import com.cspringstarthere.repositories.CommentRepository;
import com.cspringstarthere.repositories.DBCommentRepository;
import com.cspringstarthere.services.CommentService;
import com.cspringstarthere.services.UserService;

public class Main {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        System.out.println("Before retrieving the CommentService");

        var service = context.getBean(CommentService.class);

        System.out.println("After retrieving the CommentService");
    }
}