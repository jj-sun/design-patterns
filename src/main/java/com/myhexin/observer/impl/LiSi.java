package com.myhexin.observer.impl;

import com.myhexin.observer.ILiSi;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者，实现Observer接口
 */
public class LiSi implements Observer , ILiSi {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老秦汇报...");
        reportToQinShiHuang(arg.toString());
        System.out.println("李斯汇报完毕...\n");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }
}
