package com.myhexin.factory.test;

import com.myhexin.factory.AbstractHumanFactory;
import com.myhexin.factory.Human;
import com.myhexin.factory.impl.BlackHuman;
import com.myhexin.factory.impl.HumanFactory;
import com.myhexin.factory.impl.WhiteHuman;
import com.myhexin.factory.impl.YellowHuman;

/**
 * 女蜗开始造人
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
