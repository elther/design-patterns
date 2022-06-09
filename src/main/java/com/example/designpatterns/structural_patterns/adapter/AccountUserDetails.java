package com.example.designpatterns.structural_patterns.adapter;

import com.example.designpatterns.structural_patterns.adapter.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getPassword() {
        return this.account.getName();
    }

    @Override
    public String getUsername() {
        return this.account.getPassword();
    }
}
