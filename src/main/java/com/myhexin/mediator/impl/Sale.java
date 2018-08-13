package com.myhexin.mediator.impl;

import com.myhexin.mediator.AbstractColleague;
import com.myhexin.mediator.AbstractMediator;

import java.util.Random;

public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    //销售IBM电脑
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell",number);
        System.out.println("销售IBM电脑" + number + "台");
    }
    //反馈销售情况
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }

}
