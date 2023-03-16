package org.example.Deadlock;

import java.util.concurrent.locks.Lock;

public class Runnable1 implements Runnable{
    private Lock lock1 = null;
    private Lock lock2 = null;

    public Runnable1(Lock lock1,Lock lock2){
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to lock Lock 1");
        //we can use Synchronized lock as well.
        lock1.lock();
        System.out.println(threadName + " locked Lock 1");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName + " attempting to lock Lock 2");
        lock2.lock();
        System.out.println(threadName + " unlocking Lock 1");
        lock1.unlock();
        System.out.println(threadName + " unlocking Lock 2");
        lock2.unlock();
    }
}
