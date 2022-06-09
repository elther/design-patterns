package com.example.designpatterns.structural_patterns.bridge;

public class App {
    public static void main(String[] args) {
        Champion kda = new Ari(new KDA());
        kda.skillQ();
        kda.skillW();

        Champion poolParty_Ari = new Ari(new PoolParty());
        poolParty_Ari.skillR();
        poolParty_Ari.skillQ();
    }
}
