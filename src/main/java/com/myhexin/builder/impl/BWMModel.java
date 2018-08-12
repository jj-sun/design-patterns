package com.myhexin.builder.impl;

import com.myhexin.builder.CarModel;

public class BWMModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马的启动！");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马的喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马的引擎");
    }
}
