package com.company.thread;

class Line {

    public synchronized void getLine(int i) {
        try {
            System.out.println(Thread.currentThread().getName()+"Getting line for you....");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printLine(){
        System.out.println(Thread.currentThread().getName()+"I am in printintg.....!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class ThreadOrchestrator{
    public static void main(String[] args) {
        Line line = new Line();
        Thread t1 = new Thread(new ThreadRunnable(line));
        Thread t2 = new Thread(new ThreadRunnableN(line));
        t1.start();
        t2.start();
    }
}

class ThreadRunnable implements Runnable{

    Line line;

    public ThreadRunnable(Line line){
        this.line = line;
    }

    @Override
    public void run() {
        line.getLine(10);
        line.printLine();
    }
}

class ThreadRunnableN implements Runnable{

    Line line;

    public ThreadRunnableN(Line line){
        this.line = line;
    }

    @Override
    public void run() {
        int i=100;
        while( i-- > 1) {
            line.printLine();
            line.getLine(9);
        }
    }
}