package org.example.VirtualThread;

public class VirtualThreadExample {
   public static void main(String[] args)  {
//        Runnable runnable= () ->{
//            for(int i=0;i<10;i++){
//                System.out.println("Index :"+ i + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Thread t1 = Thread.ofVirtual().start(runnable);
//        Thread t2 = Thread.ofVirtual().unstarted(runnable);
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        try{
//            t2.join();
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }
}
