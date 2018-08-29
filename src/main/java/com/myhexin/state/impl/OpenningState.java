package com.myhexin.state.impl;

import com.myhexin.state.Context;
import com.myhexin.state.State;

public class OpenningState extends State {

    @Override
    public void open() {
        System.out.println("电梯门开启!");
    }

    @Override
    public void close() {
        super.context.setState(Context.closingState);
        super.context.getState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
