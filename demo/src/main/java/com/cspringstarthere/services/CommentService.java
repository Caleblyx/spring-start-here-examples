package com.cspringstarthere.services;

import com.cspringstarthere.proxies.CommentNotificationProxy;
import com.cspringstarthere.repositories.CommentRepository;

import org.springframework.stereotype.Component;

import com.cspringstarthere.model.Comment;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService (CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
    
}