package com.myhexin.liability.impl;

import com.myhexin.liability.Handler;
import com.myhexin.liability.IWomen;

public class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVEL_QEQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("女儿向儿子请求");
        System.out.println(women.getRequest());
        System.out.println("儿子答复：同意\n");
    }
}
