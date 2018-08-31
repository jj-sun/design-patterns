package com.myhexin.bridge.impl;

import com.myhexin.bridge.Product;

public class HouseProduct extends Product {
    @Override
    public void beProducted() {
        System.out.println("建造楼房");
    }

    @Override
    public void beSelled() {
        System.out.println("销售楼房");
    }
}
