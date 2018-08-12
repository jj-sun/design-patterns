package com.myhexin.builder.impl;

import com.myhexin.builder.CarModel;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("大奔的启动！");
    }

    @Override
    protected void stop() {
        System.out.println("大奔停止");
    }

    @Override
    protected void alarm() {
        System.out.println("大奔的喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("大奔的引擎");
    }
}
