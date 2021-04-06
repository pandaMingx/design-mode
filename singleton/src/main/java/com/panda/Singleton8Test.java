package com.panda;

public class Singleton8Test {
    public static void main(String[] args) {
         Singleton8 instance = Singleton8.INSTANCE;
         Singleton8 instance2 = Singleton8.INSTANCE;
        instance.sayOK();
        instance2.sayOK();
        System.out.println(instance == instance2);
    }
}
