package com.myhexin.command.test;

import com.myhexin.command.Command;
import com.myhexin.command.Invoker;
import com.myhexin.command.impl.ConcreteCommand1;
import com.myhexin.command.impl.ConcreteCommand2;

/**
 * 客户端，执行命令
 */
public class CommandClient {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand1();
        invoker.setCommand(command);
        invoker.action();
        command = new ConcreteCommand2();
        invoker.setCommand(command);
        invoker.action();
    }
}
