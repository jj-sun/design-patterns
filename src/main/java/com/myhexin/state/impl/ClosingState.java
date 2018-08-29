package com.myhexin.state.impl;

import com.myhexin.state.Context;
import com.myhexin.state.State;

public class ClosingState extends State {

    @Override
    public void open() {
        super.context.setState(Context.openningState);
        super.context.getState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        super.context.setState(Context.runningState);
        super.context.getState().run();
    }

    @Override
    public void stop() {
        super.context.setState(Context.stoppingState);
        super.context.getState().stop();
    }
}
