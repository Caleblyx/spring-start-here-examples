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

    var comment = new Comment();

    comment.setAuthor("Laurentiu");

    comment.setText("Demo Comment");
    
    var commentService = context.getBean(CommentService.class);
    commentService.publishComment(comment);
    }
}