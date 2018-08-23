package com.myhexin.adapter.test;

import com.myhexin.adapter.IUserInfo;
import com.myhexin.adapter.impl.OuterUserInfo;
import com.myhexin.adapter.impl.UserInfo;

public class AdapterTest {

    public static void main(String[] args) {
        //适配
        IUserInfo iUserInfo = new OuterUserInfo();
        //正常
        IUserInfo iUserInfo1 = new UserInfo();
    }
}
