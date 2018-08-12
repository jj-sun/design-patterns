package com.myhexin.builder.impl;

import com.myhexin.builder.CarBuilder;
import com.myhexin.builder.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
