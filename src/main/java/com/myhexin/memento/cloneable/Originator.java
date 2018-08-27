package com.myhexin.memento.cloneable;

/**
 * clone方式的备忘录
 */
public class Originator implements Cloneable {

    private String state = "";

    private Originator backup;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        backup = this.clone();
    }
    public void restoreMemento() {
        this.setState(backup.getState());
    }

    @Override
    protected Originator clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Originator)object;
    }
}
