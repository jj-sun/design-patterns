package com.myhexin.memento.cloneable;

public class CloneClient {

    public static void main(String[] args) {

        Originator originator = new Originator();

        originator.setState("心情还可以");

        System.out.println(originator.getState());

        originator.createMemento();

        originator.setState("心情不好了");

        System.out.println(originator.getState());

        originator.restoreMemento();

        System.out.println(originator.getState());

    }

}
