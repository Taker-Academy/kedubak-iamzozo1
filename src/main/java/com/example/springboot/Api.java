/*
 * This is my first API
 */

class User {
    public String firstName;
    public String lastName;
    public String createdAt;
    public String email;
    public String password;
    public String lastUpVote;
    public String _id;
}

class Comment {
    public String createdAt;
    public int id;
    public String firstName;
    public String content;
}

class Post {
    public String firstName;
    public String title;
    public String createdAt;
    public String content;
    public Comment[] comments;
    public String[] UpVotes;
}

public class Api {
    public static void main(String args[]) {
        System.out.println("Hello world");
    }
}

