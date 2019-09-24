package com.easyway.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 * Created by User on 2017/11/22.
 */
public class TestMain {
    /**
     * 观察者模式
     */
    public static void main(String[] args) {
        //被观察者
        PersonObserverable observerable = new PersonObserverable();
        //观察者
        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("tttt" + arg);
            }
        };
        //注册观测者
        observerable.addObserver(observer);
        //触发观察事件
        observerable.setName("我的名字");
        //注销观测者
        observerable.deleteObserver(observer);
    }

}
