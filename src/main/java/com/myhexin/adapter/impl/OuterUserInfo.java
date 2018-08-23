package com.myhexin.adapter.impl;

import com.myhexin.adapter.IUserInfo;

import java.util.Map;

/**
 * 适配器模式，一般不应用于项目的开始阶段
 * 用于项目后期扩展阶段
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {

        return homeInfo.get("userName").toString();
    }

    @Override
    public String getHomeAddress() {
        return homeInfo.get("homeAddress").toString();
    }

    @Override
    public String getMobileNumber() {
        return baseInfo.get("mobileNumber").toString();
    }

    @Override
    public String getOfficeTelNumber() {
        return officeInfo.get("officeTelNumber").toString();
    }

    @Override
    public String getJobPosition() {
        return officeInfo.get("jobPosition").toString();
    }

    @Override
    public String getHomeTelNumber() {
        return homeInfo.get("homeTelNumber").toString();
    }
}
