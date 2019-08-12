package com.easyway.designpatterns.description2;

public abstract class Pancake {
    public String desc = "我不是一个具体的煎饼";

    public String getDesc() {
        return desc;
    }

    public abstract double price();
}
