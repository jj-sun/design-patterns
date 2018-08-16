package com.myhexin.liability.impl;

import com.myhexin.liability.Handler;
import com.myhexin.liability.IWomen;

public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_QEQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("女儿向父亲请求");
        System.out.println(women.getRequest());
        System.out.println("父亲答复：同意\n");
    }
}
