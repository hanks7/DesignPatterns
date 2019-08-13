package com.easyway.designpatterns.Proxy2;

/**
 * 静态代理
 * 静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者继承相同的父类
 *
 * 引用是对象的父类,或者对象实现的接口
 */
public class TestMain {
    public static void main(String[] args) {
        NickClothFactory nick = new NickClothFactory();
        ProxyFactory pro = new ProxyFactory(nick);
        pro.productCloth();
    }
}
