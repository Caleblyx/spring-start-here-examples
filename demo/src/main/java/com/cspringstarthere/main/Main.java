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

        var s1 = context.getBean("commentService", CommentService.class);
        var s2 = context.getBean("userService", UserService.class);
        
        boolean b1 = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b1);
    }
}