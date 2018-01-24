package ru.javatest.Thread;


import ru.javatest.db.TestService;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class MyCallable implements Callable<String> {


    private TestService testService;
 private int count_vlue;
private AtomicInteger ai;




    public MyCallable(int count_vlue, AtomicInteger ai, TestService testService) {
        this.count_vlue = count_vlue;
        this.ai=ai;
        this.testService= testService;
    }

    @Override
    public String call() throws Exception {

        while(ai.intValue() < count_vlue+1) {
            int a=ai.getAndAdd(1);
            testService.insertitem_n(a);
            System.out.println("Thread " +  Thread.currentThread().getName() + " is running current value = " + a);
        }
    return Thread.currentThread().getName();
    }
}
