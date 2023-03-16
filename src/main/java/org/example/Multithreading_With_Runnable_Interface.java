package org.example;
public class Multithreading_With_Runnable_Interface implements Runnable{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("Runnable : " + i);
            i++;
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
