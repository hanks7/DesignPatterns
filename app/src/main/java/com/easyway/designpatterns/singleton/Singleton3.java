package com.easyway.designpatterns.singleton;

/**
 * 懒汉式
 * 线程安全，调用效率不高，懒加载
 */
public class Singleton3 {

    //类初始化时，不初始化这个对象(延时加载，真正用的时候再创建)
    private static Singleton3 instance;

    //构造器私有化
    private Singleton3(){}

    //方法同步，调用效率低
    public static synchronized Singleton3 getInstance(){
        if(instance==null){
            instance=new Singleton3();
        }
        return instance;
    }
}
