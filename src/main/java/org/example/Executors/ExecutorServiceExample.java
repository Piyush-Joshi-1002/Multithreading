package org.example.Executors;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);

        executorService.execute(newRunnable("Task 1"));

        executorService.execute(newRunnable("Task 2"));

        executorService.execute(newRunnable("Task 3"));

        executorService.shutdown();




        
        // Executor by ThreadPoolExecutor

        int corePoolSize = 10;
        int maxPoolSize = 20;
        long keepAliveTime = 3000;

        ExecutorService threadPoolExecutor =
                new ThreadPoolExecutor(
                        corePoolSize,
                        maxPoolSize,
                        keepAliveTime,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(128)
                );

        //Executor Factory Method Implementation
//        threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
//
//        Future future = threadPoolExecutor.submit(newRunnable("Task 1.1"));
//
//        System.out.println(future.isDone());
//
//        System.out.println(future.isCancelled());
//
//        try {
//            future.get(); 
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(future.isDone());
//        threadPoolExecutor.shutdown();

//        Future future = threadPoolExecutor.submit(newCallable("Task 1.1"));
//
//        System.out.println(future.isDone());
//
//        System.out.println(future.isCancelled());
//
//        try {
//            String result =(String) future.get();
//            System.out.println(result);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(future.isDone());
//        threadPoolExecutor.shutdown();

    }



    private static Runnable newRunnable(String msg){
        return new Runnable() {
            @Override
            public void run() {
                String completeMsg = Thread.currentThread().getName() + ":" + msg;
                System.out.println(completeMsg);
            }
        };
    }
    private static Callable newCallable(String msg) {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String completeMsg = Thread.currentThread().getName() + ":" + msg;
                return completeMsg;
            }
        };
    }
}
