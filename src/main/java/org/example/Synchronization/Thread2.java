package org.example.Synchronization;

public class Thread2 extends Thread{
    SharedResource sharedResource ;

    public Thread2(SharedResource sh){
        this.sharedResource = sh;
    }
    public void run() {
        sharedResource.display("Welcome");
    }


}
