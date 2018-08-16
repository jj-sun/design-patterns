package com.myhexin.liability.test;

import com.myhexin.liability.Handler;
import com.myhexin.liability.IWomen;
import com.myhexin.liability.impl.Father;
import com.myhexin.liability.impl.Husband;
import com.myhexin.liability.impl.Son;
import com.myhexin.liability.impl.Women;

import java.util.ArrayList;
import java.util.Random;

public class HandleClient {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> womenArrayList = new ArrayList<>();
        int i = 5;
        while (i --> 0) {
            womenArrayList.add(new Women(random.nextInt(4),"出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        womenArrayList.forEach(women -> {
            father.HandleMessage(women);
        });
    }
}
