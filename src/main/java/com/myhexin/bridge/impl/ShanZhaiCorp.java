package com.myhexin.bridge.impl;

import com.myhexin.bridge.Corp;
import com.myhexin.bridge.Product;

public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("生产山寨产品");
    }
}
