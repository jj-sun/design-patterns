package com.myhexin.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式的应用。
 */
public class SignInfoFactory {
    private static Map<String, SignInfo> stringSignInfoMap = new HashMap<>();

    @Deprecated
    public static SignInfo getSingInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result;

        if(!stringSignInfoMap.containsKey(key)) {
            result = new SignInfo4Pool(key);
            stringSignInfoMap.put(key,result);
            System.out.println("-----建立对象,并放入池中");
        }else {
            result = stringSignInfoMap.get(key);
            System.out.println("------直接从池中获取");
        }

        return result;
    }
}
