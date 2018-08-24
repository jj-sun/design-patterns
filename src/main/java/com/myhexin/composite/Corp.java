package com.myhexin.composite;

/**
 * 组合模式,树形结构
 * 多用于树形结构
 */
public abstract class Corp {

    private String name;

    private String position;

    private int salary;

    private Corp parent;

    public Corp(String name,String position,int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String info() {

        String info = "";
        info += "姓名:" + name;
        info += "\t职位:" + position;
        info += "\t薪水" + salary;
        return info;
    }

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }
}
