package com.myhexin.singleton;

/**
 * 懒汉式线程安全
 */
public class SingletonLazySafe {
    private static SingletonLazySafe singletonLazySafe = null;
    private SingletonLazySafe() {}

    public SingletonLazySafe getInstance() {
        if(singletonLazySafe == null) {
            synchronized (this) {
                if(singletonLazySafe == null) {
                    singletonLazySafe = new SingletonLazySafe();
                }
            }
        }
        return singletonLazySafe;
    }
}
