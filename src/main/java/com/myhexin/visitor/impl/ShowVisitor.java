package com.myhexin.visitor.impl;

import com.myhexin.visitor.Employee;
import com.myhexin.visitor.IShowVisitor;

public class ShowVisitor implements IShowVisitor {

    private String info = "";

    @Override
    public void report() {
        System.out.println(this.info);
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee) + "工作: "
        + commonEmployee.getJob() + "\t\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + "业绩: "
                + manager.getPerformance() + "\t\n";
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t"
                + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t"
                + "薪水" + employee.getSalary() + "\t";

        return info;
    }
}
