package com.hllearn.thread.initial;

import java.util.AbstractMap;

public class ImplementsRunnable implements Runnable {

    public static void main(String[] args) {
        ImplementsRunnable implementsRunnable =new ImplementsRunnable();
        Thread t1 = new Thread(implementsRunnable,"Thread-one");
        Thread t2 = new Thread(implementsRunnable,"Thread two");
        Thread t3 = new Thread(implementsRunnable,"Thread Three");

        t1.start();
        t2.start();
        t3.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + ":" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
