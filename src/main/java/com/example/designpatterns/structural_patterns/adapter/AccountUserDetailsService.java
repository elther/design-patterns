package com.example.designpatterns.structural_patterns.adapter;

import com.example.designpatterns.structural_patterns.adapter.security.UserDetails;
import com.example.designpatterns.structural_patterns.adapter.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
