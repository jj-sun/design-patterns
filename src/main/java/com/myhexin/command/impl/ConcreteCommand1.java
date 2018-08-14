package com.myhexin.command.impl;

import com.myhexin.command.Command;

/**
 * 命令抽象的继承之一
 */
public class ConcreteCommand1 extends Command {
    public ConcreteCommand1() {
        super(new Receiver1());
    }

    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
