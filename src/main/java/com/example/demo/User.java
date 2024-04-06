package com.example.demo;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class User {
    @Id
    private String _id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpVote;

    public User(String firstName, String lastName, String email, String password, LocalDateTime createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.email = email;
        this.password = password;
        this.lastUpVote = null;
    }

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
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

    public LocalDateTime getLastUpVote() {
        return lastUpVote;
    }

    public void setLastUpVote(LocalDateTime lastUpVote) {
        this.lastUpVote = lastUpVote;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
