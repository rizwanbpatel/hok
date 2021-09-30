package com.company.multithread;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Orchestrator {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        /*executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Aync Task : "+ Thread.currentThread().getName());
            }
        });*/

        /*Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Future Async : "+Thread.currentThread().getName());
            }
        });
*/
        Set<Callable<String>> callables = new HashSet<>();


        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Future Async 1: " + Thread.currentThread().getName());
                return "Callable 1";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Future Async 2: " + Thread.currentThread().getName());
                return "Callable 2";
            }
        });

        List<Future<String>> futures = executorService.invokeAll(callables);

        for(Future<String> future : futures){
            System.out.println("XX "+ future.get());
        }

        executorService.shutdown();
    }
}
