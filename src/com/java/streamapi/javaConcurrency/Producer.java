package com.java.streamapi.javaConcurrency;

public class Producer implements Runnable{

    LockConditions lc = new LockConditions();
    @Override
    public void run() {
        try {
            lc.producer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
