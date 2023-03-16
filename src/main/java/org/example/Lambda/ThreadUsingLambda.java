package org.example.Lambda;

public class ThreadUsingLambda {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                int i=0;
//                while(true) {
//                    System.out.println("Thread "+ Thread.currentThread().getName() + " is working "+ i++);
//                    try {
//                        Thread.sleep(300);
//                    } catch (Exception e) {
//
//                    }
//                }
//            }
//        };
//        new Thread(runnable,"RunnableThread").start();
//        new Thread(()->{
//            int i=0;
//            while(true) {
//                System.out.println("Thread "+ Thread.currentThread().getName() + " is working "+ i++);
//                try {
//                    Thread.sleep(500);
//                } catch (Exception e) {
//
//                }
//            }
//        }).start();

        int i = 0;
        while(true) {
            System.out.println("Main is working "+ i++);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
