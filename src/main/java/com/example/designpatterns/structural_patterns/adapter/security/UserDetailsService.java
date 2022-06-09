package com.example.designpatterns.structural_patterns.adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
