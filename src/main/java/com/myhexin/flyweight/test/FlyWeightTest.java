package com.myhexin.flyweight.test;

import com.myhexin.flyweight.SignInfo;
import com.myhexin.flyweight.SignInfoFactory;

public class FlyWeightTest {

    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            String subject = "科目" + i;
            for(int j=1; j<=30; j++) {
                String key = subject +  "考场" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考场1");
    }
}
