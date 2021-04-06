package com.panda;

/**
 * 5 懒汉式(线程安全，同步代码块)
 * 优点：解决了线程安全问题；
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步
 */
public class Singleton5 {

    // 1.构造器私有化
    private Singleton5() {
    }

    // 2.本类内部声明
    private static Singleton5 instance;

    // 3.提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    // 4.加入同步处理的代码，解决线程安全问题,同步的是代码块
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
