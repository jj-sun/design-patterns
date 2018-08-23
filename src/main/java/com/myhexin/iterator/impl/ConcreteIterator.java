package com.myhexin.iterator.impl;

import com.myhexin.iterator.Iterator;

import java.util.Vector;

public class ConcreteIterator<T> implements Iterator<T> {

    private Vector<T> vector = new Vector();


    private int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
    }

    @Override
    public boolean hasNext() {
        if(cursor == vector.size()) {
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        if(hasNext()) {
            return vector.get(cursor++);
        }
        return null;
    }

    @Override
    public boolean remove() {
        vector.remove(this.cursor);
        return true;
    }
}
