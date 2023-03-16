package org.example.Executors;

import java.util.*;
import java.util.concurrent.*;

public class Executor_InvokeAny {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<String>> callables = new ArrayList<>();
        callables.add(newCallable("Task 1.1"));

        callables.add(newCallable("Task 1.2"));

        callables.add(newCallable("Task 1.3"));

//        try {
//            String result = (String) executorService.invokeAny((Collection) callables);
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

        try{
            List<Future<String>> results= executorService.invokeAll((Collection<Callable<String>>)callables );
            for(Future future : results){
                System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();

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
