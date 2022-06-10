package com.example.designpatterns.structural_patterns.composite.before;

import com.example.designpatterns.structural_patterns.composite.after.Component;

public class Item implements Component {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
