package com.easyway.designpatterns.description;

public abstract class Coffee {
    protected String description = "Unknown Coffee";

    /**
     * 什么样的coffee
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 价格
     * @return
     */
    public abstract double cost();
}
