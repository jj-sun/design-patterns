package com.myhexin.factory.test;

import com.myhexin.factory.SimpleHumanFactory;
import com.myhexin.factory.impl.BlackHuman;
import com.myhexin.factory.impl.WhiteHuman;
import com.myhexin.factory.impl.YellowHuman;

/**
 * 简单工厂使用
 * 女蜗造人
 */
public class SimpleNvWa {
    public static void main(String[] args) {
        WhiteHuman whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        BlackHuman blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        YellowHuman yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
