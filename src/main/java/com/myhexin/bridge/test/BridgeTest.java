package com.myhexin.bridge.test;

import com.myhexin.bridge.Corp;
import com.myhexin.bridge.impl.HouseCorp;
import com.myhexin.bridge.impl.HouseProduct;
import com.myhexin.bridge.impl.ShanZhaiCorp;
import com.myhexin.bridge.impl.ShanZhaiProduct;

public class BridgeTest {

    public static void main(String[] args) {
        Corp houseCorp = new HouseCorp(new HouseProduct());
        houseCorp.makeMoney();

        Corp shanZhaiCorp = new ShanZhaiCorp(new ShanZhaiProduct());

        shanZhaiCorp.makeMoney();
    }

}
