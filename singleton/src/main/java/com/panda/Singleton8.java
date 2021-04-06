package com.panda;

/**
 * 8 枚举
 * 优点：这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象；
 * 缺点：#
 * 这种方式是 Effective Java 作者 Josh Bloch  提倡的方式
 */
public enum Singleton8 {
    INSTANCE; //属性

    public void sayOK() {
        System.out.println("ok~");
    }
}
