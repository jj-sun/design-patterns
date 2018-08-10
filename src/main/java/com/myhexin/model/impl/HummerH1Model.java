package com.myhexin.model.impl;

import com.myhexin.model.HummerModel;

public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("H1 start!");
    }

    @Override
    protected void stop() {
        System.out.println("H1 end!");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1 engineBoom");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
