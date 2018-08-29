package com.myhexin.state.test;

import com.myhexin.state.Context;
import com.myhexin.state.impl.ClosingState;

public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }

}
