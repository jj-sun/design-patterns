package com.myhexin.builder.impl;

import com.myhexin.builder.CarBuilder;
import com.myhexin.builder.CarModel;

import java.util.ArrayList;

public class BWMBuilder extends CarBuilder {
    private BWMModel bwmModel = new BWMModel();
    @Override
    public void setSequence(ArrayList sequence) {
        bwmModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bwmModel;
    }
}
