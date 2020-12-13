package com.java.streamapi.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cyclicbrarrir  implements  Runnable{
    private CyclicBarrier barrier;
    public Cyclicbrarrir(CyclicBarrier barrier) {
        this.barrier=barrier;
    }

    @Override
    public void run() {

        while(true){
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
        //send some messages
    }
    public static void main(String [] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        CyclicBarrier barrier = new CyclicBarrier(3);
        service.submit(new Cyclicbrarrir(barrier));
        service.submit(new Cyclicbrarrir(barrier));
        service.submit(new Cyclicbrarrir(barrier));
        Thread.sleep(1000);

    }

}
