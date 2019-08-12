package com.easyway.designpatterns.description;

public class Milk extends CondimentDecorator {

    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {//重写该方法，
        return coffee.getDescription() + ", 牛奶";
    }

    //从装饰者开始调用，一路调用，计算钱
    public double cost() {
        return 0.2 + coffee.cost();
    }

}
