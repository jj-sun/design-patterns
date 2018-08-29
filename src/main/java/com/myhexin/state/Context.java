package com.myhexin.state;

import com.myhexin.state.impl.ClosingState;
import com.myhexin.state.impl.OpenningState;
import com.myhexin.state.impl.RunningState;
import com.myhexin.state.impl.StoppingState;

public class Context {
    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();
    public static final RunningState runningState = new RunningState();
    public static final StoppingState stoppingState = new StoppingState();

    private State state;

    public void setState(State state) {
        this.state  = state;
        this.state.setContext(this);
    }

    public State getState() {
        return state;
    }

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void run() {
        state.run();
    }

    public void stop() {
        state.stop();
    }
}
