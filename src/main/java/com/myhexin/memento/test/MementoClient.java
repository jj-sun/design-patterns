package com.myhexin.memento.test;

import com.myhexin.memento.Caretaker;
import com.myhexin.memento.Originator;

/**
 * 备忘录模式，用于数据的备份恢复
 */
public class MementoClient {

    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("心情还不错");
        System.out.println("之前的心情: " + originator.getState());
        Caretaker caretaker = new Caretaker();

        caretaker.setMemento(originator.createMemento());

        originator.setState("心情不好了");

        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());

        System.out.println(originator.getState());
    }

}
