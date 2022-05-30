package com.example.designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        Settings a = Settings.getInstance();
        Settings b = Settings.getInstance();
        System.out.println(a==b);
    }
}
