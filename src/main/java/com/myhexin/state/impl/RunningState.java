package com.myhexin.state.impl;

import com.myhexin.state.Context;
import com.myhexin.state.State;

public class RunningState extends State {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯运行中");
    }

    @Override
    public void stop() {
        super.context.setState(Context.stoppingState);
        super.context.getState().stop();
    }
}
