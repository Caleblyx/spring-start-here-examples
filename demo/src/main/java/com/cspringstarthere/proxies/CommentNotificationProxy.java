package com.cspringstarthere.proxies;

import com.cspringstarthere.model.Comment;

public interface CommentNotificationProxy {
    
    void sendComment(Comment comment);
}
