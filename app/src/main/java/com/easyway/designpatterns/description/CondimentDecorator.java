package com.easyway.designpatterns.description;

public abstract class CondimentDecorator extends Coffee {
    //所有的调料装饰者都必须重新实现这个方法，因为装饰者的description是要要修饰被装饰者的description的
    public abstract String getDescription();
}
