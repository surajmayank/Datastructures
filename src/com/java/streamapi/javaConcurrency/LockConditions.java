package com.java.streamapi.javaConcurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditions {

    private Lock lock = new ReentrantLock();
    private Condition added = lock.newCondition();
    private Condition removed = lock.newCondition();
    public static final int MAXCOUNT=10;
    List<Integer> list = new ArrayList();
    int count=1;


    public void producer() throws InterruptedException {
        lock.lock();
        try{
            while(count == MAXCOUNT){
                removed.await();
            }
             list.add(count);
            System.out.println("added the value to the list"+count);
            count++;
            added.signal();
        }
        finally {
            lock.unlock();
        }
    }
    public void consumer() throws InterruptedException {
        lock.lock();
        try{
            while(count <= 0){
                added.await();
            }
            System.out.println("size"+list.size());
            if(list.size()==MAXCOUNT);
            {
                int data = list.get(8);
                list.remove(8);
                System.out.println("removed the value to the list"+data);
                removed.signal();
            }
        }
        finally {
            lock.unlock();
        }
    }


}
