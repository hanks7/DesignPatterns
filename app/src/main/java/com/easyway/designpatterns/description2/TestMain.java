package com.easyway.designpatterns.description2;

public class TestMain {
    /**
     * 装饰者模式
     * https://blog.csdn.net/jiangjunlanzhoulan/article/details/81271401
     * @param args
     */
    public static void main(String[] args) {

        Pancake tornCake = new TornCake();
        //手抓饼基础价
        System.out.println(String.format("%s ￥%s", tornCake.getDesc(), tornCake.price()));

        Pancake roujiamo = new Roujiamo();
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new Ham(roujiamo);
        roujiamo = new MeatFloss(roujiamo);
        roujiamo = new Cucumber(roujiamo);
        //我好饿
        System.out.println(String.format("%s ￥%s", roujiamo.getDesc(), roujiamo.price()));
    }

}
