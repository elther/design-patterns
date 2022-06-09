package com.example.designpatterns.structural_patterns.bridge.java;

import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class BridgeInSpring {

    public static void main(String[] args) {
        MailSender mailSender = new JavaMailSenderImpl();
    }
}
