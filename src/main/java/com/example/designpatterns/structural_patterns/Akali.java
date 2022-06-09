package com.example.designpatterns.structural_patterns;

import com.example.designpatterns.structural_patterns.bridge.DefaultChampion;
import com.example.designpatterns.structural_patterns.bridge.Skin;

public class Akali extends DefaultChampion {
    public Akali(Skin skin, String name) {
        super(skin, "Akali");
    }
}
