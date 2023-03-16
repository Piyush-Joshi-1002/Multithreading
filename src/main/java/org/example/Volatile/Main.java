package org.example.Volatile;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        ReadThread readThread = new ReadThread(sharedResource);
        WriteThread writeThread = new WriteThread(sharedResource);
        readThread.start();
        writeThread.start();
    }
}
