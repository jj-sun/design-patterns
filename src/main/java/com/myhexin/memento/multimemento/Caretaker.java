package com.myhexin.memento.multimemento;

import java.util.HashMap;

/**
 * 多备份的 备忘录
 */
public class Caretaker {
    /*private Memento memento;

    public Memento getMemento(String ids) {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }*/

    private HashMap<String,Memento> mapMemento = new HashMap<>();

    public Memento getMemento(String ids) {
        return mapMemento.get(ids);
    }

    public void setMemento(String ids,Memento memento) {
        mapMemento.put(ids,memento);
    }

}
