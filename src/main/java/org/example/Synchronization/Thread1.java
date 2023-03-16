package org.example.Synchronization;


public class Thread1 extends Thread {
    SharedResource sharedResource ;

    public Thread1(SharedResource sh) {

        this.sharedResource = sh;
    }
    public void run() {
        sharedResource.display("Hello world");
    }
}
