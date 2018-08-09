package com.myhexin.factory.impl;

import com.myhexin.factory.Human;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }

    @Override
    public void talk() {
        System.out.println("说汉语");
    }
}
