package com.myhexin.proxy.impl;

import com.myhexin.proxy.Subject;

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something ---->" + str);
    }
}
