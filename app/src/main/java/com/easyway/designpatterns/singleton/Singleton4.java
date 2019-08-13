package com.easyway.designpatterns.singleton;

/**
 * 饿汉模式(多线程安全)
 *
 * 饿汉模式的线程安全
 * 同样通过类加载解决同步问题，
 * 但没有达到懒加载目的。
 *
 *
 */
public class Singleton4 {

    private Singleton4() {
    }

    private static Singleton4 instance = new Singleton4();


    public static Singleton4 getInstance() {
        return instance;
    }
}
