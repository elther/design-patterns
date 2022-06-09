package com.example.designpatterns.structural_patterns.adapter;

import com.example.designpatterns.structural_patterns.adapter.security.LoginHandler;
import com.example.designpatterns.structural_patterns.adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("elther", "elther");
        System.out.println("login = " + login);
    }
}
