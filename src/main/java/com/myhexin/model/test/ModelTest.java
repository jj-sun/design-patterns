package com.myhexin.model.test;

import com.myhexin.model.HummerModel;
import com.myhexin.model.impl.HummerH1Model;
import com.myhexin.model.impl.HummerH2Model;

/**
 * 模板模式，测试
 */
public class ModelTest {
    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        HummerModel h2 = new HummerH2Model();
        ((HummerH1Model) h1).setAlarm(true);
        h1.run();
        System.out.println("-----------------");
        h2.run();
    }
}
