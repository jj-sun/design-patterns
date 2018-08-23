package com.myhexin.iterator.impl;

import com.myhexin.iterator.Aggregate;
import com.myhexin.iterator.Iterator;

import java.util.Vector;

public class ConcreteAggregate<T> implements Aggregate<T> {

    private Vector<T> vector = new Vector();

    @Override
    public void add(T t) {
        vector.add(t);
    }

    @Override
    public void remove(T t) {
        vector.remove(t);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}
