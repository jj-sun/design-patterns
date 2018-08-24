package com.myhexin.composite.test;

import com.myhexin.composite.impl.Branch;

public class CorpTest {
    public static void main(String[] args) {
        Branch root = new Branch("赵老大","CEO",100);
        Branch k1 = new Branch("钱老二","总经理",80);
        Branch k2 = new Branch("孙老三","副总经理",80);
        Branch k3 = new Branch("李老四","科长",60);
        Branch k4 = new Branch("周老五","副科长",60);

        root.addSubordinate(k1);
        root.addSubordinate(k2);

        k1.addSubordinate(k3);
        k2.addSubordinate(k4);

        root.getSubordinateList().forEach(x -> System.out.println(x.info()));
    }
}
