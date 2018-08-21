package com.myhexin.strategy.impl;

import com.myhexin.strategy.Strategy;

public class SecondStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("后撤退");
    }
}
