package com.easyway.designpatterns.singleton;

/**
 * 双重检查模式
 * <p>
 * 延迟初始化。和懒汉模式一致，只有在初次调用静态方法getSingleton，才会初始化signleton实例。
 * 性能优化。同步会造成性能下降，在同步前通过判读singleton是否初始化，减少不必要的同步开销。
 * 线程安全。同步创建Singleton对象，同时注意到静态变量singleton使用volatile修饰。
 *
 * 引用为volatile后，伪代码 重排序在多线程中将被禁止!
 *
 * 单例的作用:
 *  1、单例类只能有一个实例。
 *  2、单例类必须自己创建自己的唯一实例。
 *  3、单例类必须给所有其他对象提供这一实例。
 */
public class Singleton {

    private Singleton() {
    }

    private volatile static Singleton singleton; //1:volatile修饰

    public static Singleton getSingleton() {
        if (singleton == null) { //2:减少不要同步，优化性能
            synchronized (Singleton.class) { // 3：同步，线程安全
                if (singleton == null) {
                    singleton = new Singleton(); //4：创建singleton 对象
                }
            }
        }
        return singleton;
    }
}
