package com.example.designpatterns.structural_patterns.bridge;

public class KDA_Akali implements Champion{
    @Override
    public void move() {
        System.out.println("KDA ari move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA ari q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA ari w");
    }

    @Override
    public void skillE() {
        System.out.println("KDA ari e");
    }

    @Override
    public void skillR() {
        System.out.println("KDA ari r");
    }
}
