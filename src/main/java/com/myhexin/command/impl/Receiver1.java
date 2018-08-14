package com.myhexin.command.impl;

import com.myhexin.command.Receiver;

/**
 * 接收者之一
 */
public class Receiver1 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("1 做事情");
    }
}
