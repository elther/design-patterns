package com.example.designpatterns.structural_patterns.composite.before;

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

    private void printPrice(Bag bag) {
        System.out.println(bag.getPrice());
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }
}
