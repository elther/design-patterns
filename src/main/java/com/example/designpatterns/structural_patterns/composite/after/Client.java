package com.example.designpatterns.structural_patterns.composite.after;

import com.example.designpatterns.structural_patterns.composite.before.Bag;
import com.example.designpatterns.structural_patterns.composite.before.Item;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("doran blade", 450);
        Item healPotion = new Item("health potion", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);

    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
