package com.myhexin.memento;

/**
 * 备份管理器,符合迪米特法则
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
