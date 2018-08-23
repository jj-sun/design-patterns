package com.myhexin.iterator;

public interface Iterator<T> {

    boolean hasNext();

    T next();

    boolean remove();

}
