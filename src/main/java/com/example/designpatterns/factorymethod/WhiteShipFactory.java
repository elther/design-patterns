package com.example.designpatterns.factorymethod;

import com.example.designpatterns.abstract_factory.WhitePartsProFactory;

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
