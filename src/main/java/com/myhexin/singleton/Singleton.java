package com.myhexin.singleton;

/**
 * 恶汉式线程安全
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

}

