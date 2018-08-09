package com.myhexin.factory.impl;

import com.myhexin.factory.Human;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种");
    }
    @Override
    public void talk() {
        System.out.println("说英语");
    }
}
