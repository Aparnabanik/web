package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class register {

    @Id
    private String email;
    private String username;

    private String password;
    private String conformpassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConformpassword() {
        return conformpassword;
    }

    public void setConformpassword(String conformpassword) {
        this.conformpassword = conformpassword;
    }

    @Override
    public String toString() {
        return "register{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", conformpassword='" + conformpassword + '\'' +
                '}';
    }
}
