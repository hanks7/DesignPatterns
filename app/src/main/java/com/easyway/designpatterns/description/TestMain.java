package com.easyway.designpatterns.description;

public class TestMain {
    /**
     * https://blog.csdn.net/L_BestCoder/article/details/66967740
     * 装饰者模式
     * @param args
     */
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " " + coffee.cost());

        Coffee coffee1 = new Espresso();
        coffee1 = new Milk(coffee1);//加一份牛奶
        System.out.println(coffee1.getDescription() + " " + coffee1.cost());
    }
}
