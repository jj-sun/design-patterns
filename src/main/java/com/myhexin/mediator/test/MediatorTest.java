package com.myhexin.mediator.test;

import com.myhexin.mediator.AbstractMediator;
import com.myhexin.mediator.impl.Mediator;
import com.myhexin.mediator.impl.Purchase;
import com.myhexin.mediator.impl.Sale;
import com.myhexin.mediator.impl.Stock;

/**
 * 中介者模式测试
 */
public class MediatorTest {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("采购");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        System.out.println("销售");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("库存清理");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
