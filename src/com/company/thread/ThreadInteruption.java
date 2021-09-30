package com.company.thread;

class ThreadInteruption extends Thread {
    public static void main(String args[]) {
        ThreadInteruption t1 = new ThreadInteruption();
        t1.setName("Aven");
        ThreadInteruption t2 = new ThreadInteruption();
        t2.setName("Ger");
        t1.start();
        t1.interrupt();
        t2.start();


    }

    public void run() {

        System.out.println("State "+Thread.currentThread().getName() +" "+  Thread.currentThread().isInterrupted() );

        if (Thread.interrupted()) {
            System.out.println(Thread.currentThread().getName()+" code for interrupted thread");
        } else {
            System.out.println(Thread.currentThread().getName()+" code for normal thread");
        }
    }
}
