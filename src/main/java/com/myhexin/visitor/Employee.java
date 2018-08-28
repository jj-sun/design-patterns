package com.myhexin.visitor;

public abstract class Employee {

    public static final int FEMALE = 1;

    public static final int MALE = 0;

    private int salary;

    private int sex;

    private String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}


