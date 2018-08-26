package com.myhexin.decorator;

/**
 * 装饰模式
 */
public class Decorator extends Component{
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
