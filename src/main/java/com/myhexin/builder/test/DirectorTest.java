package com.myhexin.builder.test;

import com.myhexin.builder.impl.BWMModel;
import com.myhexin.builder.impl.BenzModel;
import com.myhexin.builder.impl.Director;

public class DirectorTest {
    public static void main(String[] args) {
        Director director = new Director();
        BenzModel benzModel = director.getBenzMoel();
        BWMModel bwmModel = director.getBWMModel();
        benzModel.run();
        System.out.println("===================");
        bwmModel.run();
    }
}
