package com.myhexin.command.impl;

import com.myhexin.command.Receiver;

/**
 * 接收者之二
 */
public class Receiver2 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("2 做事情");
    }
}
