package org.example.Inter_Thread_Communication;

public class MyData {
    int value;
    boolean flag;
    public MyData(){
        this.flag = false;
        this.value = 0;
    }
    synchronized void set(int x ){
        while(flag != false) {
            try {
                wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        flag = true;
        notify();
        value = x;
    }
    synchronized int get(){
        while(flag != true) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        flag = false;
        int x = value;
        notify();
        return x;
    }
}
