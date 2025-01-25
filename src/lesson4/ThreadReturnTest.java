package lesson4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadReturnTest {
    public static void main(String[] args) {
        Runnable task = () -> check();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

//        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        ExecutorService executorService = Executors.newCachedThreadPool();

        Runnable runnable = () -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println(Thread.currentThread().getName() + " active thread count: " + Thread.activeCount());
        };
        for (int i = 0; i < 150; i++) {
//            executorService.execute(runnable);
            executorService.submit(runnable);
        }
//        executorService.execute(() -> System.out.println("Test"));
//        executorService.shutdownNow();
        try {
            executorService.shutdown();
            boolean termination = executorService.awaitTermination(200L, TimeUnit.MILLISECONDS);
            System.err.println(termination);
            if (!termination){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean check(){
        try {
            Thread.sleep(2000);
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
