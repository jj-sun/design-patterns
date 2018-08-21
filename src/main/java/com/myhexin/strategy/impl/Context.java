package com.myhexin.strategy.impl;

import com.myhexin.strategy.Strategy;

/**
 * 上下文角色
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doAnyThing() {
        strategy.doSomething();
    }

}
