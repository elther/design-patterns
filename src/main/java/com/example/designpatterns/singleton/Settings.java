package com.example.designpatterns.singleton;

public class Settings {

    // volatile java i.5 higher
    private static volatile Settings instance;

    private Settings(){ }

    // synchronized 성능에 별로 좋지 않다..
    public static Settings getInstance(){
        if(instance == null){
            synchronized (Settings.class){
                if(instance == null){
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
