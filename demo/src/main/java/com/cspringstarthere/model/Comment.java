package com.cspringstarthere.model;

public class Comment {
    private String author;
    private String text;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String ret = "text='" + getText() + "', author='" + getAuthor() + "'";  
        return ret;
    }
}
