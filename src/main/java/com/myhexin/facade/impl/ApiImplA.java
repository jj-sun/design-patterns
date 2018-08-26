package com.myhexin.facade.impl;

import com.myhexin.facade.Api;

public class ApiImplA implements Api {

    @Override
    public void test() {
        System.out.println("A");
    }
}
