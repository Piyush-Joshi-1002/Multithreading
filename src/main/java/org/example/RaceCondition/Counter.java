package org.example.RaceCondition;

 public  class  Counter {
    int i = 0;
    synchronized int incAndGet() {
        return ++i;
    }
     synchronized  int get(){
        return i;
    }
}
