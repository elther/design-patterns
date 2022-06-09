package com.example.designpatterns.creational_patterns.abstract_factory;

import com.example.designpatterns.creational_patterns.factorymethod.Ship;
import com.example.designpatterns.creational_patterns.factorymethod.ShipFactory;
import com.example.designpatterns.creational_patterns.factorymethod.WhiteShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
