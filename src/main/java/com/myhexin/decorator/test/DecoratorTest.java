package com.myhexin.decorator.test;

import com.myhexin.decorator.Component;
import com.myhexin.decorator.impl.ConcreteComponent;
import com.myhexin.decorator.impl.ConcreteDecorator1;
import com.myhexin.decorator.impl.ConcreteDecorator2;

public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
