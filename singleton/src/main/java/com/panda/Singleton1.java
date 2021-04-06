package com.panda;

/**
 * 一、饿汉式(静态常量)
 * 优点：类装载的时候就完成实例化。避免了线程同步问题；
 * 缺点：没有达到 Lazy Loading 的效果
 */
public class Singleton1 {

    // 2.本类内部创建对象实例
    private final static Singleton1 instance = new Singleton1();

    // 1.构造器私有化
    private Singleton1(){
    }

    // 3.提供一个公有的静态方法，返回实例对象
    public Singleton1 getInstance(){
        return instance;
    }
}
