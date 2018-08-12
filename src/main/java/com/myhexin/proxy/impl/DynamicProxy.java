package com.myhexin.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理封装
 * @param <T>
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if(true) {
            ( new BefaoreAdvice()).exec();
        }
        //Proxy的方法
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
