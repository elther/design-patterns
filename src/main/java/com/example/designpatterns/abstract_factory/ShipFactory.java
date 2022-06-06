package com.example.designpatterns.abstract_factory;

import com.example.designpatterns.factorymethod.Ship;
import com.example.designpatterns.factorymethod.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }

}
