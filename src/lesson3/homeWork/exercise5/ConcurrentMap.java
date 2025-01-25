package lesson3.homeWork.exercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
    public static void main(String[] args) throws InterruptedException {


        Map<String, Integer> map = new ConcurrentHashMap<>();
//        Map<String, Integer> map = new HashMap<>();


        Runnable runnable = () -> {
            for (int i = 0; i < 500; i++) {
                map.put("Value" + i, i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();


        Thread.sleep(2000);

        System.out.println(map.size());

    }
}
