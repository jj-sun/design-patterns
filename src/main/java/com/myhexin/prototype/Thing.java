package com.myhexin.prototype;

import java.util.ArrayList;

/**
 * 原型模式，就是实现cloneable接口，来实现对象的复制
 * 浅拷贝和深拷贝
 * 1、浅拷贝只是复制对象， 对象内部数组、引用对象等都不拷贝。
 * 2、深拷贝就是将所有的属性进行复制。
 * 3、以下，若对list数组做复制操作，则为深拷贝，否则，为浅拷贝
 * 4、引用对象不能是final的，否则会报错
 */
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();
    @Override
    public Thing clone() {
        Thing thing = null;
        //浅拷贝
        try {
            thing = (Thing)super.clone();
            //若有此句，则为深拷贝
            thing.arrayList = (ArrayList<String>) arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
    public void setValue(String value) {
        arrayList.add(value);
    }
    public ArrayList<String> getValue() {
        return arrayList;
    }
}
