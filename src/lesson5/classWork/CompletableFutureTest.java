package lesson5.classWork;

import java.util.concurrent.*;

public class CompletableFutureTest {

    public static void main(String[] args) {
        transfer();
    }

    private static void transfer() {
        Callable<Boolean> firstCardCheckCallable = () -> checkCard("1");
        Callable<Boolean> secondCardCheckCallable = () -> checkCard("2");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Boolean> firstFuture = executorService.submit(firstCardCheckCallable);
        Future<Boolean> secondFuture = executorService.submit(secondCardCheckCallable);

        try {
            Boolean first = firstFuture.get();
            Boolean second = secondFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean checkCard(String card) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Card checked: " + card);
        return true;
    }
}
