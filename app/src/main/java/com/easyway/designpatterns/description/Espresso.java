package com.easyway.designpatterns.description;

public class Espresso extends Coffee {

    public Espresso() {
        this.description = "拿铁";
    }

    public double cost() {
        return 1.99;
    }
}
