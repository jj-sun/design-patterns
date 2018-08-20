package com.myhexin.decorator.impl;

import com.myhexin.decorator.Component;
import com.myhexin.decorator.Decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void myMethod() {
        System.out.println("加一个装饰1");
    }

    @Override
    public void operate() {
        myMethod();
        super.operate();
    }
}
