package com.cspringstarthere.repositories;

import org.springframework.stereotype.Component;

import com.cspringstarthere.model.Comment;


public class DBCommentRepository implements CommentRepository {
    
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment " + comment.getText());
    }
}
