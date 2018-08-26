package com.myhexin.observer.impl;

import com.myhexin.observer.IHanFeiZi;

import java.util.Observable;

/**
 * 被观察者，继承类
 * 在被观察者类中，会调用循环调用update方法。
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
