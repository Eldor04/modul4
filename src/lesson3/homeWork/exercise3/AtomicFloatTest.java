package lesson3.homeWork.exercise3;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicFloatTest {

    public static void main(String[] args) throws InterruptedException {

        AtomicReference<Float> count = new AtomicReference<>(0F);

        Runnable runnable1 = () -> {
            for (int i = 0; i < 500; i++) {
                try {
                    count.updateAndGet(counter ->{
                       counter = counter + 4;
                       return counter;

                    });
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


        Thread.sleep(3000);

        System.out.println(count.get());
    }
}
