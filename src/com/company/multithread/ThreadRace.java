package com.company.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadRace {

    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new A());
        Thread t3 = new Thread(new A());
        t1.setName("1");
        t2.setName("2");
        t3.setName("3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class A implements Runnable {
    private static AtomicInteger counter;
   // static ReentrantLock lock = new ReentrantLock();

    A() {
        counter = new AtomicInteger(1);
    }

    @Override
    public void run() {
        while (true) {
            printCounter();
        }
    }

    public synchronized static void printCounter() {
        try {
          //  lock.lock();
            if (Thread.currentThread().getName().equals(counter.get() + "")) {
                System.out.println("Thread " + Thread.currentThread().getName() + " " + counter.get());
                if (counter.get() == 3) {
                    counter.set(1);
                } else
                    counter.incrementAndGet();
            }
        } finally {
          //  lock.unlock();
        }
    }
}