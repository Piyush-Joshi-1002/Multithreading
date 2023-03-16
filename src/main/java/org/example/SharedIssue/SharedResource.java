package org.example.SharedIssue;

public class SharedResource {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread2.start();
        thread1.start();

    }
}
