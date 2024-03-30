package com.cspringstarthere.services;

import com.cspringstarthere.proxies.CommentNotificationProxy;
import com.cspringstarthere.repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cspringstarthere.model.Comment;

@Service
@Lazy
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    
    public CommentService() {
        System.out.println("CommentService instance created!");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
