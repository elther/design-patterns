package com.example.designpatterns.creational_patterns.factorymethod;

import com.example.designpatterns.creational_patterns.abstract_factory.WhitePartsProFactory;

public class WhiteShipFactory implements ShipFactory{

    public WhiteShipFactory(WhitePartsProFactory whitePartsProFactory) {
    }

    public WhiteShipFactory() {

    }

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {

    }
}
