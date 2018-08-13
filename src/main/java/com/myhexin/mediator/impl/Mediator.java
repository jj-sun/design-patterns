package com.myhexin.mediator.impl;

import com.myhexin.mediator.AbstractMediator;

/**
 * 中介者模式，松耦合处理，将紧耦合方法，通过中介者来进行整合。
 */
public class Mediator extends AbstractMediator {
    /**
     * 中介者方法
     * @param str
     * @param objects
     */
    @Override
    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")) {  //采购电脑
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")) { //销售电脑
            this.sellComputer((Integer)objects[0]);
        }else if(str.equals("sale.offsell")) {  //折价销售
            this.offSell();
        }else if (str.equals("stock.clear")) { //清仓处理
            this.clearStock();
        }
    }
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        //销售情况良好
        if(saleStatus > 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        }else {  //销售情况不好
            int buyNumber = number/2;
            System.out.println("采购IBM电脑：" + buyNumber + "台");
        }
    }

    //销售电脑
    private void sellComputer(int number) {
        //库存数量不够销售
        if(super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }
    //折价销售电脑
    private void offSell() {
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber());
    }
    //清仓处理
    private void clearStock() {
        //要求清仓销售
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}
