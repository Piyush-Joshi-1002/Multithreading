package org.example;

public class MultiThreading_Extends_Threads extends Thread{
    private Runnable run;

    public void run(){
        int i = 0;
        while(true){
            i++;
            System.out.println("Extendable : " + i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
