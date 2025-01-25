package lesson3.homeWork.exercise2;

import java.util.concurrent.atomic.AtomicLong;


public class AtomicIntegerTest {

    public static AtomicLong counter = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {


        Runnable runnable1 = () -> {
            for (int i = 0; i < 500; i++) {
                try {
                    counter.addAndGet(2);
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread3.start();


        Thread.sleep(3000);

        System.out.println(counter);
    }
}
