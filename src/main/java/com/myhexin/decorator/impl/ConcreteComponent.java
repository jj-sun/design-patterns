package com.myhexin.decorator.impl;

import com.myhexin.decorator.Component;

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something!");
    }
}
