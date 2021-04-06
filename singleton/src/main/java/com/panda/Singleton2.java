package com.panda;

/**
 * 二、饿汉式(静态代码块)
 * 优点：类装载的时候就完成实例化。避免了线程同步问题；
 * 缺点：没有达到 Lazy Loading 的效果
 */
public class Singleton2 {

    // 1.构造器私有化
    private Singleton2(){
    }

    // 2.本类内部声明
    private final static Singleton2 instance;

    //3.在静态代码块中，创建单例对象
    static {
        instance = new Singleton2();
    }

    // 4.提供一个公有的静态方法，返回实例对象
    public Singleton2 getInstance(){
        return instance;
    }
}
