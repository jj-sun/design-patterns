package com.myhexin.bridge;

/**
 * 桥模式
 */
public abstract class Corp {
    protected Product product;
    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        product.beProducted();
        product.beSelled();
    }
}
