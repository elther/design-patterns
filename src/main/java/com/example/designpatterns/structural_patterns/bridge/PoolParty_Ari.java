package com.example.designpatterns.structural_patterns.bridge;

public class PoolParty_Ari implements Champion {
    @Override
    public void move() {
        System.out.println("PoolParty ari move");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty ari q");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty ari w");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty ari e");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty ari r");
    }
}
