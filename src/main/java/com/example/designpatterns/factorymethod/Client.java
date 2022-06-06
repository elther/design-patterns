package com.example.designpatterns.factorymethod;

import java.util.Calendar;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "elther@naver.com");
        client.print(new BlackShipFactory(), "blackship", "elther@naver.com");
        Calendar calendar;
        
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
