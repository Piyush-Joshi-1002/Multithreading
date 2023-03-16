package org.example.Volatile;

public class ReadThread extends Thread {
    SharedResource sharedResource = null;
    ReadThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i = 0; i< 20;i++){
            sharedResource.getReadCount();
        }

    }
}
