package com.myhexin.prototype.test;

import com.myhexin.prototype.Thing;

public class PrototypeTest {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("zhangsan");
        Thing cloneThing = thing.clone();
        cloneThing.setValue("lisi");
        System.out.println(thing.getValue());
    }
}
