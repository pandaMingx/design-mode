package com.panda;

/**
 * 7 静态内部类
 * 优点：采用了类装载的机制来保证初始化实例时只有一个线程；
 * 缺点：#
 * 推荐使用
 */
public class Singleton7 {

    // 1.构造器私有化
    private Singleton7() {
    }

    // 2.本类内部声明
    private static  Singleton7 instance;

    // 3. 写一个静态内部类,该类中有一个静态属性
     private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    // 4.提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static  Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
