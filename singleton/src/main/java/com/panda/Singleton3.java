package com.panda;

/**
 * 三、懒汉式(线程不安全)
 * 优点：起到了 Lazy Loading 的效果；
 * 缺点：如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 */
public class Singleton3 {

    // 1.构造器私有化
    private Singleton3() {
    }

    // 2.本类内部声明
    private static Singleton3 instance;

    //3.提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
