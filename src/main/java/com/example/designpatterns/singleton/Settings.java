package com.example.designpatterns.singleton;

import java.util.Set;

public class Settings {

    private static final Settings INSTANCE = new Settings();

    private Settings(){

    }

    // synchronized 성능에 별로 좋지 않다..
    public static synchronized Settings getInstance(){
        return INSTANCE;
    }
}
