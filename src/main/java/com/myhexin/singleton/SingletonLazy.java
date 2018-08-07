package com.myhexin.singleton;

/**
 * 懒汉式线程不安全
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if(singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
