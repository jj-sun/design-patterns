package com.myhexin.visitor.impl;

import com.myhexin.visitor.Employee;
import com.myhexin.visitor.IVisitor;

public class Manager extends Employee {

    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
