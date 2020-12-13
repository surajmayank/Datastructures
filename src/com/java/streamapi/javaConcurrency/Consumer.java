package com.java.streamapi.javaConcurrency;

public class Consumer implements Runnable{
    LockConditions lc = new LockConditions();
    @Override
    public void run() {
        try {
            lc.consumer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
