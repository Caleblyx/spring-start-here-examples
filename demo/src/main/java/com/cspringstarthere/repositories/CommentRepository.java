package com.cspringstarthere.repositories;
import com.cspringstarthere.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
