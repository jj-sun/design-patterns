package com.myhexin.memento.multimemento;

public class MultiClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState1("1");
        originator.setState2("2");
        originator.setState3("3");
        System.out.println(originator);
        Caretaker caretaker = new Caretaker();

        caretaker.setMemento("001",originator.createMemento());
        caretaker.setMemento("002",originator.createMemento());

        originator.setState1("4");
        originator.setState2("5");
        originator.setState3("6");
        System.out.println(originator);

        originator.restoreMemento(caretaker.getMemento("001"));

        System.out.println(originator);
    }
}
