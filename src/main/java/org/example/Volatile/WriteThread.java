package org.example.Volatile;

public class WriteThread extends Thread {
    SharedResource sharedResource = null;
    WriteThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i = 0; i< 20;i++){
            sharedResource.getWriteCount();
        }

    }
}
