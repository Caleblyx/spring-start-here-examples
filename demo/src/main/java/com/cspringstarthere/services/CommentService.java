package com.cspringstarthere.services;

import com.cspringstarthere.proxies.CommentNotificationProxy;
import com.cspringstarthere.repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cspringstarthere.model.Comment;

@Component
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;


    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
    
}
