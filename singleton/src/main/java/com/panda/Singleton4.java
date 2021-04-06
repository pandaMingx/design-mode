package com.panda;

/**
 * 4 懒汉式(线程安全，同步方法)
 * 优点：解决了线程安全问题；
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步
 */
public class Singleton4 {

    // 1.构造器私有化
    private Singleton4() {
    }

    // 2.本类内部声明
    private static Singleton4 instance;

    // 3.提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    // 4.加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
