package com.example.springboot;

public class User {
    private String firstName;
    private String lastName;
    private String createdAt;
    private String email;
    private String password;
    private String lastUpVote;
    private String _id;

    // Constructor
    public User(String firstName, String lastName, String createdAt, String email, String password, String lastUpVote, String _id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.email = email;
        this.password = password;
        this.lastUpVote = lastUpVote;
        this._id = _id;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastUpVote() {
        return lastUpVote;
    }

    public void setLastUpVote(String lastUpVote) {
        this.lastUpVote = lastUpVote;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastUpVote='" + lastUpVote + '\'' +
                ", _id='" + _id + '\'' +
                '}';
    }
}

