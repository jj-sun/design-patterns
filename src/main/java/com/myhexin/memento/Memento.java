package com.myhexin.memento;

/**
 * 备忘录模式，此类充当需要被记录的点。
 * 用于数据的备份与恢复。
 */
public class Memento {
    private String state;

    public Memento(String  state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
