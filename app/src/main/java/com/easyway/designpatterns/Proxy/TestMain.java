package com.easyway.designpatterns.Proxy;

/**
 * 代理模式
 */
public class TestMain {

    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
