package lesson3.homeWork.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentList {
    public static void main(String[] args) throws InterruptedException {

//        race condition muammosiga duch keladi
//        List<Integer> numbers = new ArrayList<>();

//        race condition muammosiga tushmaydi
        List<Integer> numbers = new CopyOnWriteArrayList<>();


        Runnable runnable = () -> {
            for (int i = 0; i < 500; i++) {
                numbers.add(i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();


        Thread.sleep(2000);

        System.out.println(numbers.size());

    }
}
