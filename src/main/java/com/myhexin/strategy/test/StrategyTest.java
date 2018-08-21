package com.myhexin.strategy.test;

import com.myhexin.strategy.impl.Context;
import com.myhexin.strategy.impl.FirstStrategy;
import com.myhexin.strategy.impl.SecondStrategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context context;
        context = new Context(new FirstStrategy());
        context.doAnyThing();
        context = new Context(new SecondStrategy());
        context.doAnyThing();
    }
}
