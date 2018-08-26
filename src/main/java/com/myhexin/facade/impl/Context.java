package com.myhexin.facade.impl;

import com.myhexin.facade.Api;

public class Context {
    Api a = new ApiImplA();
    Api b = new ApiImplB();
    public void testConext() {
        a.test();
        b.test();
    }
}
