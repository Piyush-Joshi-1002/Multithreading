package org.example.ThreadSignaling;

public class ThreadSignalingExample {
    public static void main(String[] args) {
        Object signalObject = new Object();
        Thread waitingThread = new Thread(()->{
            synchronized (signalObject){
                try{
                    signalObject.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread notifyingThread = new Thread(()->{
            synchronized (signalObject){
                signalObject.notify();
            }
        });


        SignalCarrier signalCarrier = new SignalCarrier();
        Thread waiter = new Thread(()->{
            synchronized (signalCarrier){
                try{
                    signalCarrier.doWait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread notifier= new Thread(()->{
            synchronized (signalCarrier){
                signalCarrier.doNotify();
            }
        });
        waiter.start();
        notifier.start();
    }
}
