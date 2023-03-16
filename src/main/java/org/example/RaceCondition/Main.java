package org.example.RaceCondition;

public class Main {


    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(getRunnable(counter, "This is thread 1"));

        Thread t2 = new Thread(getRunnable(counter, "This is thread 2"));
        t1.start();
        t2.start();

    }
    private static Runnable getRunnable(Counter counter,String message ){
        return ()->{
            for(int i=0;i<1000000;i++){
                counter.incAndGet();
            }
            System.out.println(counter.get() + " " + message);
        };
    }
}
