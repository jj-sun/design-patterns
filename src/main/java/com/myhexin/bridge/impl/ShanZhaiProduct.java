package com.myhexin.bridge.impl;

import com.myhexin.bridge.Product;

public class ShanZhaiProduct extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产iphone");
    }

    @Override
    public void beSelled() {
        System.out.println("销售假的iphone");
    }
}
