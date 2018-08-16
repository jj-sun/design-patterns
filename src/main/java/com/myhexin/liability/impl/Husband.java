package com.myhexin.liability.impl;

import com.myhexin.liability.Handler;
import com.myhexin.liability.IWomen;

public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_QEQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("女儿向丈夫请求");
        System.out.println(women.getRequest());
        System.out.println("丈夫答复：同意\n");
    }
}
