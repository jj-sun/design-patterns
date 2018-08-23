package com.myhexin.adapter.impl;

import com.myhexin.adapter.IUserInfo;

public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        String userName = "战三";
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭住址");
        return "家庭地址";
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号码");
        return "手机号码";
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室电话");
        return "办公室电话";
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位");
        return "职位";
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭电话");
        return "家庭电话";
    }
}
