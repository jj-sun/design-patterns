package com.myhexin.visitor.impl;

import com.myhexin.visitor.ITotalVisitor;

public class TotalVisitor implements ITotalVisitor {

    private final static int MANAGE_COEFFCIENT = 5;
    private final static int COMMONEMPLOYEE_COEFFCIENT = 2;

    private int commonTotalSalary = 0;

    private int managerTotalSalary = 0;

    @Override
    public void totalSalary() {
        System.out.println("本公司的月工资总和是: " + (this.commonTotalSalary + this.managerTotalSalary));
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary()*COMMONEMPLOYEE_COEFFCIENT;
    }

    @Override
    public void visit(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary()*MANAGE_COEFFCIENT;
    }
}
