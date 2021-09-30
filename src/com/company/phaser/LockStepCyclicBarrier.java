package com.company.phaser;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class LockStepCyclicBarrier extends LockStepExample {

    public static void main(String[] args) {
        LockStepCyclicBarrier lscb = new LockStepCyclicBarrier();
        ExecutorService pool = newFixedThreadPool(TASKS_PER_BATCH);

        CyclicBarrier barrier = new CyclicBarrier(TASKS_PER_BATCH);
        for (int batch = 0; batch < BATCHES; batch++) {
            for (int i = 0; i < TASKS_PER_BATCH; i++) {
                int batchNumber = batch + 1;
                pool.submit(() -> lscb.task(barrier, batchNumber));

            }
        }
    }

    private void task(CyclicBarrier barrier, int batchNumber) {
        boolean interrupted = Thread.interrupted();

        while(true){
            try{
                barrier.await();
                break;
            }catch ( InterruptedException e){
                interrupted = true;
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }

        if(interrupted){
            Thread.currentThread().interrupt();
        }
        doTask(batchNumber);
    }
}
