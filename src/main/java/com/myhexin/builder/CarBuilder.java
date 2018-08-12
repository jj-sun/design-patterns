package com.myhexin.builder;

import java.util.ArrayList;

/**
 * 构建者模式
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList sequence);

    public abstract CarModel getCarModel() ;
}
