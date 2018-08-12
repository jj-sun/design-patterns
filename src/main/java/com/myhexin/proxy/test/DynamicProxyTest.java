package com.myhexin.proxy.test;

import com.myhexin.proxy.Subject;
import com.myhexin.proxy.impl.RealSubject;
import com.myhexin.proxy.impl.SubjectDynamicProxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Dynamic proxy");
    }
}
