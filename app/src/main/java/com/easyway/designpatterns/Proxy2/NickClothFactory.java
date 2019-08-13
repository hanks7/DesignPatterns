package com.easyway.designpatterns.Proxy2;

//被代理类(目标对象)
class NickClothFactory implements ClothFactory {

    @Override
    public void productCloth() {
        System.out.println("Nick工厂生产Nick");
    }
}
