package com.example.designpatterns.abstract_factory;

import com.example.designpatterns.factorymethod.Ship;
import com.example.designpatterns.factorymethod.ShipFactory;
import com.example.designpatterns.factorymethod.WhiteShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
