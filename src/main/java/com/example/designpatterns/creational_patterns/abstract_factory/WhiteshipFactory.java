package com.example.designpatterns.creational_patterns.abstract_factory;

public class WhiteshipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }
}
