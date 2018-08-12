package com.myhexin.proxy.impl;

import com.myhexin.proxy.IAdvice;

public class BefaoreAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("前置通知");
    }
}
