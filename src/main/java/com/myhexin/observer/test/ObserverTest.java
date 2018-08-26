package com.myhexin.observer.test;

import com.myhexin.observer.impl.HanFeiZi;
import com.myhexin.observer.impl.LiSi;

public class ObserverTest {

    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();

        hanFeiZi.addObserver(liSi);

        hanFeiZi.haveBreakfast();

        hanFeiZi.haveFun();
    }

}
