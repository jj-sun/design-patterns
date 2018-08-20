package com.myhexin.decorator.impl;

import com.myhexin.decorator.Component;
import com.myhexin.decorator.Decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }
    private void myMethod2() {
        System.out.println("装饰一下2");
    }

    @Override
    public void operate() {
        super.operate();
        myMethod2();
    }
}
