package com.myhexin.singleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {
    public static void main(String[] args) throws Exception{
        Task t = new Task();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0; i< 5 ; i++) {
            executorService.execute(t);
        }
        Thread.sleep(2000);
        System.out.println(t.set);
        executorService.shutdown();

    }
}
class Task implements Runnable {

    public Set<SingletonLazy> set = new HashSet<>();
    @Override
    public void run() {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        set.add(singletonLazy);
    }
}
