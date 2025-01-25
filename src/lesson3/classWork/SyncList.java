package lesson3.classWork;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncList {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> suncNumbers = Collections.synchronizedList(numbers);



        Runnable runnable1 = () -> {
            for (int i = 0; i < 500; i++) {
                suncNumbers.add(i);
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

        System.out.println(numbers.size());

    }

}
