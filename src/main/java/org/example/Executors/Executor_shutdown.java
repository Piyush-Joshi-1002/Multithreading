package org.example.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Executor_shutdown {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.shutdown();
        List<Runnable> runnables = executorService.shutdownNow();
        System.out.println(runnables);

        try {
            executorService.awaitTermination(3000L, TimeUnit.MILLISECONDS);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
