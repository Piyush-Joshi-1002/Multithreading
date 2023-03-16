package org.example.Inter_Thread_Communication;

public class Consumer extends Thread{
    MyData myData;
    Consumer(MyData myData){
        this.myData = myData;
    }
    public void run(){
        while(true){
            System.out.println("Consumer :" + myData.get());
        }
    }
}
