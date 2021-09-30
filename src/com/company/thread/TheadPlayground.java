package com.company.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertEquals;

public class TheadPlayground {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ " Done");
            return null;
        });


        assertEquals(9,executor.getPoolSize());
        assertEquals(0, executor.getQueue().size());
        System.out.println(Thread.currentThread().getName()+ " Done");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(Thread.currentThread().getName()+ " Done");
    }
}
