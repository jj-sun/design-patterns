package com.myhexin.factory.impl;

import com.myhexin.factory.Human;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种");
    }

    @Override
    public void talk() {
        System.out.println("说非洲语");
    }
}
