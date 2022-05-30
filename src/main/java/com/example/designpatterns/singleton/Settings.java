package com.example.designpatterns.singleton;

import java.io.Serializable;

public enum Settings {

    INSTANCE;

    Settings(){

    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
