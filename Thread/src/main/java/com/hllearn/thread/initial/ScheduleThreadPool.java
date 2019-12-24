package com.hllearn.thread.initial;

import java.util.concurrent.*;

public class ScheduleThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            public void run() {
                for (int j = 0; j < 3; j++) {
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            }
        },2000,2000, TimeUnit.MILLISECONDS);
    }
}
