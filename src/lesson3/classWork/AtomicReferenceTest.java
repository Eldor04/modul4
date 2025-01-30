package lesson3.classWork;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {

    public static void main(String[] args) throws InterruptedException {

        AtomicReference<Account> accountRef = new AtomicReference<>(new Account());


        Runnable runnable1 = () -> {
            for (int i = 0; i < 500; i++) {

                accountRef.updateAndGet(account -> {
                    account.count = account.count + 1;
                    return account;
                });
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();


        Thread.sleep(2000);


        System.out.println(accountRef.get().count);
    }

    public static class Account {
        public int count = 0;
    }
}
