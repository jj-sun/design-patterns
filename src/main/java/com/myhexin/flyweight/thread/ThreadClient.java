package com.myhexin.flyweight.thread;

import com.myhexin.flyweight.SignInfo;
import com.myhexin.flyweight.SignInfoFactory;

public class ThreadClient {

    public static void main(String[] args) {
        for(int i=1; i<=4;i ++) {
            SignInfoFactory.getSignInfo("科目" + i);
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
        while (true) {
            signInfo.setId("zhangsan");
            signInfo.setLocation("zhangsan");
            new MultiThread(signInfo).start();

            signInfo.setId("lisi");
            signInfo.setLocation("lisi");
            new MultiThread(signInfo).start();
        }
    }

}
