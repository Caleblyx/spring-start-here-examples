package com.cspringstarthere.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cspringstarthere.config.ProjectConfiguration;
import com.cspringstarthere.model.Comment;
import com.cspringstarthere.proxies.EmailCommentNotificationProxy;
import com.cspringstarthere.repositories.CommentRepository;
import com.cspringstarthere.repositories.DBCommentRepository;
import com.cspringstarthere.services.CommentService;

public class Main {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();

        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
    }
}