package org.example.ThreadLocal;

public class Main{
    /*
    * it is design to keep single value internaly (per thread)
    * one single value per thread asscesed by the tread local
    * */
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Thread t1 = new Thread(()->{
            threadLocal.set("Thread_1");
            try{
                Thread.sleep(2000);
                System.out.println(threadLocal.get());
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()->{
            threadLocal.set("Thread_2");
            try{
                Thread.sleep(2000);
                System.out.println(threadLocal.get());
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
