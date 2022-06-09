package com.example.designpatterns.structural_patterns.adapter;

import com.example.designpatterns.structural_patterns.adapter.security.UserDetails;

public class Account implements UserDetails {

    private String name;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
