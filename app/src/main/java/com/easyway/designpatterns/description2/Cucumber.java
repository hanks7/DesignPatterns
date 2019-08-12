package com.easyway.designpatterns.description2;

class Cucumber extends Pancake {
    private Pancake pancake;

    public Cucumber(Pancake pancake) {
        this.pancake = pancake;
    }


    @Override
    public String getDesc() {
        return pancake.getDesc() + ", Cucumber";
    }

    @Override
    public double price() {
        return pancake.price() + 2.2;
    }
}
