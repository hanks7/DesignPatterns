package com.easyway.designpatterns.description2;

class MeatFloss extends Pancake {
    private Pancake pancake;

    public MeatFloss(Pancake pancake) {
        this.pancake = pancake;
    }


    @Override
    public String getDesc() {
        return pancake.getDesc() + ", MeatFloss";
    }

    @Override
    public double price() {
        return pancake.price() + 2.1;
    }
}
