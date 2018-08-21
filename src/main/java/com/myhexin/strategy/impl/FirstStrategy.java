package com.myhexin.strategy.impl;

import com.myhexin.strategy.Strategy;

public class FirstStrategy implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("先求助");
    }
}
