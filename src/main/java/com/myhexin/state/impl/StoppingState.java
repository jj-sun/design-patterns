package com.myhexin.state.impl;

import com.myhexin.state.Context;
import com.myhexin.state.State;

public class StoppingState extends State {

    @Override
    public void open() {
        super.context.setState(Context.openningState);
        super.context.getState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setState(Context.runningState);
        super.context.getState().run();
    }

    @Override
    public void stop() {
        System.out.println("停止状态");
    }
}
