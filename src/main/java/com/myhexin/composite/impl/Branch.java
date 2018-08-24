package com.myhexin.composite.impl;

import com.myhexin.composite.Corp;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {

    private List<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        setParent(this);
        subordinateList.add(corp);
    }
    public List<Corp> getSubordinateList() {
        return subordinateList;
    }
}
