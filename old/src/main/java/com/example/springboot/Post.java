package com.example.springboot;

class Comment {
    private String createdAt;
    private String id;
    private String firstName;
    private String content;

    public String getCreatedAt() {
        return createdAt;
    }
    
    public String id() {
        return id;
    }
    
    public String firstName() {
        return firstName;
    }
    
    public String firstContent() {
        return content;
    }
}

public class Post {
    private String firstName;
    private String title;
    private String createdAt;
    private String content;
    private Comment[] comments;
    private String[] upVotes;

    public Post(String firstName, String title, String createdAt, String content, Comment[] comments, String[] upVotes) {
        this.firstName = firstName;
        this.title = title;
        this.createdAt = createdAt;
        this.content = content;
        this.comments = comments;
        this.upVotes = upVotes;
    }

    public String getFirstName() {
        return firstName;
    }
}
