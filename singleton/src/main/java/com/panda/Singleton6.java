package com.panda;

/**
 * 6 双重检查
 * 优点：线程安全；延迟加载；效率较高；
 * 缺点：#
 * 推荐使用
 */
public class Singleton6 {

    // 1.构造器私有化
    private Singleton6() {
    }

    // 2.本类内部声明 volatile
    private static volatile  Singleton6 instance;

    // 3.提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    // 4.加入同步处理的代码，解决线程安全问题
    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
