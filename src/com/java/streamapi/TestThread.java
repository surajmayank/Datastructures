package com.java.streamapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {

    public static void main(String args []){

        ThreadClass th = new ThreadClass();
        for(int i=0;i<10;i++){
            Thread t = new Thread(th);
            t.start();
    // what if we have to perform 100 task so o perform 100 task need to create 100 number of thread . and that is expensive .
    // to over come from this we have the concept threadPool where we will define the fix number of the thread.
    //which will perform the fixed number of the task.
            System.out.println("current Thread"+Thread.currentThread().getName());
        }


        ExecutorService service  = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            service.execute(th);
         System.out.println("executor Thread"+Thread.currentThread().getName());
        }

        for(int i=0;i<10;i++){
            service.submit(() -> {

            });
        }
    }
}
