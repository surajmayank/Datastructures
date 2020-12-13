package com.java.streamapi;

public class ThreadClass implements Runnable{
    @Override
    public void run() {
        System.out.println("run method of runnable interface"+Thread.currentThread().getName());
    }
}
