package com.hllearn.thread.initial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i <5 ; i++) {
            executorService.submit(new Runnable() {
                public void run() {
                    for (int j = 0; j < 3; j++) {
                        System.out.println(Thread.currentThread().getName() + ":" + j);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
