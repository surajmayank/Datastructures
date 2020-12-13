package com.java.streamapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExcecutorService {
    public static void main(String [] args){
        int coreCount= Runtime.getRuntime().availableProcessors();

        System.out.println("coreCount " +coreCount);


        //ExecutorService service = Executors.newFixedThreadPool(coreCount);
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        service.schedule(new Task(),10, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new Task(),15,10,TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new Task(),15,15,TimeUnit.SECONDS);

        for (int i=0;i<10;i++){
            service.scheduleAtFixedRate(new Task(),15,10,TimeUnit.SECONDS);
            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);
        }


    }
}
class Task implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}