package org.example.Collections.Synchronized;

import java.util.*;

public class SynchronizedCollection {
    // Java program to demonstrate synchronizedCollection()
// method for Integer Value

    public static void main(String[] argv) throws Exception {
        try {
            List<String> vector = (List<String>) Collections.synchronizedCollection(new ArrayList<String>());

            Runnable thread1 = ()->{
                for(int i=0;i<5;i++){
                    vector.add("thread1");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            };
            Runnable thread2 = ()->{
                for(int i=0;i<5;i++){
                    vector.add("Thread2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            };
            thread1.run();
            thread2.run();
            System.out.println(vector);
        }
        catch (Exception e) {
            System.out.println("Exception thrown : " + e);
        }

    }
}
