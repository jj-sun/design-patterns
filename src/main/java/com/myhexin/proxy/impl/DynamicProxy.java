package com.myhexin.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if(true) {
            ( new BefaoreAdvice()).exec();
        }

        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
