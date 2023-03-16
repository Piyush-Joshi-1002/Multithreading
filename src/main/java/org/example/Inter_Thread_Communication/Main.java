package org.example.Inter_Thread_Communication;

public class Main {
    public static void main(String[] args) {
        MyData myData = new MyData();
        Consumer c1 = new Consumer(myData);
        Producer p1 = new Producer(myData);

        p1.start();
        c1.start();
    }
}
