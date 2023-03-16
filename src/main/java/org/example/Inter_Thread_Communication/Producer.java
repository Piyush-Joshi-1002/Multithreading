package org.example.Inter_Thread_Communication;

public class Producer extends Thread{
    MyData myData;
    Producer(MyData myData){
        this.myData = myData;
    }
    public void run(){
        int i = 0;
        while(true){
            myData.set(i);
            System.out.println("Producer : " +i);
            i++;
        }
    }
}
