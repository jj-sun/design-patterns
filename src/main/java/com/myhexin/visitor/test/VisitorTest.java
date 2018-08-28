package com.myhexin.visitor.test;

import com.myhexin.visitor.Employee;
import com.myhexin.visitor.IShowVisitor;
import com.myhexin.visitor.ITotalVisitor;
import com.myhexin.visitor.impl.CommonEmployee;
import com.myhexin.visitor.impl.Manager;
import com.myhexin.visitor.impl.ShowVisitor;
import com.myhexin.visitor.impl.TotalVisitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {

    public static void main(String[] args) {

        ITotalVisitor iTotalVisitor = new TotalVisitor();
        IShowVisitor showVisitor = new ShowVisitor();
        for(Employee employee : mockEmployee()) {
            employee.accept(iTotalVisitor);
            employee.accept(showVisitor);
        }
        showVisitor.report();
        iTotalVisitor.totalSalary();

    }


    private static List<Employee> mockEmployee() {
        List<Employee> list = new ArrayList<>();
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setName("张三");
        zhangsan.setSex(0);
        zhangsan.setSalary(1800);
        zhangsan.setJob("编写java的苦逼程序员");

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("网页美工");
        lisi.setName("李四");
        lisi.setSex(1);
        lisi.setSalary(1900);

        Manager manager = new Manager();

        manager.setName("王五");
        manager.setSex(Employee.MALE);
        manager.setSalary(12000);
        manager.setPerformance("业绩不错");

        list.add(zhangsan);
        list.add(lisi);
        list.add(manager);
        return list;
    }
}
