package com.myhexin.facade;

import com.myhexin.facade.impl.ApiImplA;
import com.myhexin.facade.impl.ApiImplB;
import com.myhexin.facade.impl.Context;

/**
 * 外观模式，经常使用于Controller层，将多个service层方法，集中在一个Controller方法中实现具体的功能。
 * 对外提供唯一的入口。
 */
public class Facade {
    Api a = new ApiImplA();
    Api b = new ApiImplB();
    Context context = new Context();
    public void facade() {
        a.test();
    }

    public void facdeB() {
        b.test();
    }

    public void facadeContext() {
        context.testConext();
    }

}
