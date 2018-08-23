package com.myhexin.iterator.test;

import com.myhexin.iterator.Aggregate;
import com.myhexin.iterator.Iterator;
import com.myhexin.iterator.impl.ConcreteAggregate;

public class IteratorTest {

    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate();
        aggregate.add("abc");
        aggregate.add("123");
        aggregate.add("!@#");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
