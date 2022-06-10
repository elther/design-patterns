package com.example.designpatterns.structural_patterns.composite.before;

import com.example.designpatterns.structural_patterns.composite.after.Component;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    List<Component> components = new ArrayList<>();

    public Bag() {
    }

    public void add(Component component){
        this.components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(c -> c.getPrice()).sum();
    }
}
