package com.myhexin.mediator;

import com.myhexin.mediator.impl.Purchase;
import com.myhexin.mediator.impl.Sale;
import com.myhexin.mediator.impl.Stock;

/**
 * 中介者模式，抽象类
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;
    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str,Object... objects);
}
