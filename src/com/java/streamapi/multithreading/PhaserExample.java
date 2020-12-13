package com.java.streamapi.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserExample implements Runnable {
    private Phaser phaser;
    public PhaserExample(Phaser phaser) {
        this.phaser=phaser;
    }

    @Override
    public void run() {

        //do some tasks
      //  phaser.arrive();
        while(true) {
            phaser.arriveAndAwaitAdvance();
        }

    }


    public static void main(String [] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(new PhaserExample(phaser));
        service.submit(new PhaserExample(phaser));
        service.submit(new PhaserExample(phaser));
       //phaser.awaitAdvance(1);
        Thread.sleep(1000);
    }
}
