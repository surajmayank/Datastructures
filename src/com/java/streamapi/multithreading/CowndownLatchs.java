package com.java.streamapi.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CowndownLatchs implements Runnable
{
private CountDownLatch latch;
    public CowndownLatchs(CountDownLatch latch) {
        this.latch=latch;
    }
    @Override
    public void run() {

        //do some task
        latch.countDown();

    }

    public static void main(String []args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);

        CountDownLatch latch = new CountDownLatch(3);
        service.submit(new CowndownLatchs(latch));
        service.submit(new CowndownLatchs(latch));
        service.submit(new CowndownLatchs(latch));

        latch.await();

        //all three thread initialization





    }
}
