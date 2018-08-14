package com.myhexin.command.impl;

import com.myhexin.command.Command;

/**
 * 命令抽象的继承之二
 */
public class ConcreteCommand2 extends Command {

    public ConcreteCommand2() {
        super(new Receiver2());
    }
    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
