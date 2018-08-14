package com.myhexin.command;

/**
 * 定义命令抽象
 */
public abstract class Command {
    protected final Receiver receiver;
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    public abstract void execute();
}
