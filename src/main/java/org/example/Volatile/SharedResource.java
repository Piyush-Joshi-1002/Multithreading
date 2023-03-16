package org.example.Volatile;

import java.util.*;

public class SharedResource {
    private volatile int writeCount = 0;
    private int readCount = 0;
    private boolean reading = false;
    public void getWriteCount(){
        writeCount++;
        System.out.println("writing : write count " + writeCount );
        int arr[] = new int[100];
        for(int i =0;i<arr.length;i++) {
            if (arr[i] == Integer.MAX_VALUE) {
                arr[i] = -1;
            }
        }
    }
    public void getReadCount(){
        writeCount--;
        System.out.println(" Reading :  write count" + writeCount );
    }
}
