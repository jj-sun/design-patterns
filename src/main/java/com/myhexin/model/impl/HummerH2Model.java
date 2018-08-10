package com.myhexin.model.impl;

import com.myhexin.model.HummerModel;

public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H2 start!");
    }

    @Override
    protected void stop() {
        System.out.println("H2 end!");
    }

    @Override
    protected void alarm() {
        System.out.println("H2 alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2 engineBoom");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
