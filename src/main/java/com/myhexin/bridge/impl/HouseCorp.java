package com.myhexin.bridge.impl;

import com.myhexin.bridge.Corp;
import com.myhexin.bridge.Product;

public class HouseCorp extends Corp {

    public HouseCorp(Product product) {
        super(product);
        System.out.println("房地产赚钱");
    }
}
