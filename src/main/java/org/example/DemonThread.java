package org.example;

public class DemonThread extends Thread{
    @Override
    public void run() {
        super.run();
        int count =1;
        while(count<50){

            System.out.println("Count in Thread : " + count++);
            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
