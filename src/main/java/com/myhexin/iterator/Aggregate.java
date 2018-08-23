package com.myhexin.iterator;

public interface Aggregate<T> {
    void add(T t);

    void remove(T t);

    Iterator iterator();
}
