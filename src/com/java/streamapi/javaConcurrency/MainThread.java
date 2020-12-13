package com.java.streamapi.javaConcurrency;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        Producer p = new Producer();
        Consumer c = new Consumer();
        Runnable target;
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
