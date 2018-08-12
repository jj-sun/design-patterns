package com.myhexin.builder.test;

import com.myhexin.builder.impl.BWMBuilder;
import com.myhexin.builder.impl.BWMModel;
import com.myhexin.builder.impl.BenzModel;
import com.myhexin.builder.impl.BenzBuilder;

import java.util.ArrayList;

public class BuilderTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("start");
        arrayList.add("stop");
        arrayList.add("alarm");
        arrayList.add("engineBoom");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(arrayList);
        BenzModel benzMol = (BenzModel) benzBuilder.getCarModel();
        benzMol.run();
        System.out.println("===================");
        BWMBuilder bwmBuilder = new BWMBuilder();
        bwmBuilder.setSequence(arrayList);
        BWMModel bwmModel = (BWMModel) bwmBuilder.getCarModel();
        bwmModel.run();
    }
}
