package com.myhexin.model;

/**
 * 定义模板模式，抽象方法类,将方法的实现延迟给子类实现
 * 抽象模板的基本方法尽量设计为protected类型，符合迪米特法则。
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public void run() {
        this.start();
        this.stop();
        if(isAlarm()) {
            this.alarm();
        }
        this.engineBoom();
    }
    protected boolean isAlarm() {
        return true;
    }
}
