package com.example.designpatterns.abstract_factory;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
