package com.myhexin.flyweight.thread;

import com.myhexin.flyweight.SignInfo;

public class MultiThread extends Thread {
    private SignInfo signInfo;


    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;
    }

    @Override
    public void run() {
        if(!signInfo.getId().equals(signInfo.getLocation())) {
            System.out.println("编号" + signInfo.getId());
            System.out.println("地址:" + signInfo.getLocation());
            System.out.println("线程不安全了");
        }
    }
}
