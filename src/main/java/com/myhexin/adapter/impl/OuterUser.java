package com.myhexin.adapter.impl;

import com.myhexin.adapter.IOuterUser;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

    @Override
    public Map getUserBaseInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("userName","李四");
        map.put("mobileNumber","1555555555");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("homeTelNumber","家庭电话");
        map.put("homeAddress","家庭地址");
        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("jobPosition","职位");
        map.put("officeTelNumber","办公室电话");
        return map;
    }
}
