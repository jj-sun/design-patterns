package com.myhexin.proxy.impl;

import com.myhexin.proxy.Subject;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader,interfaces,myInvocationHandler);
    }
}
