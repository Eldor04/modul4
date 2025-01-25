package lesson4;

import java.util.concurrent.*;

public class testing {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        transfer("789", "123", 4000);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

    }

    public static void transfer(String from, String to, long amount) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Callable<Boolean> volidFromCardCalleble = () -> cardCheck(from);
        Callable<Boolean> volidToCardCalleble = () -> cardCheck(to);
        Callable<Boolean> checkedBalanceFromCardCallable = () -> checkBalance(from, 4000);

        Future<Boolean> volidFromCardFuture = executorService.submit(volidFromCardCalleble);
        Future<Boolean> volidToCardFuture = executorService.submit(volidToCardCalleble);
        Future<Boolean> checkedBalanceFromCardFuture = executorService.submit(checkedBalanceFromCardCallable);

        try {
            Boolean validFrom = volidFromCardFuture.get();
            Boolean validTo = volidToCardFuture.get();
            Boolean validCheckedBalance = checkedBalanceFromCardFuture.get();

            if (validFrom && validTo && validCheckedBalance) {
                System.out.println("Transaction.. ");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Transactioned");
        executorService.shutdown();

    }

    public static boolean cardCheck(String number) {
        try {
            System.out.println("Card checking... ");
            Thread.sleep(2000);
            System.out.println("Card check");
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkBalance(String toCard, long amount) {
        try {
            System.out.println("Card balance checking... ");
            Thread.sleep(2000);
            System.out.println("Card balance checked");
            return true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
