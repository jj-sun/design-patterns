package com.myhexin.builder.impl;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BWMBuilder bwmBuilder = new BWMBuilder();
    public BenzModel getBenzMoel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }
    public BWMModel getBWMModel() {
        sequence.clear();
        sequence.add("alarm");
        sequence.add("engineBoom");
        bwmBuilder.setSequence(sequence);
        return (BWMModel) bwmBuilder.getCarModel();
    }
}
