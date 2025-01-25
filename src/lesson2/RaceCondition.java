package lesson2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceCondition {
    private static int count = 0;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        for (int i = 0; i < 30000; i++) {
            Runnable runnable = () -> locker();
            Thread thread = new Thread(runnable);
            thread.start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("count = " + count);

    }

    public static void countInc() {
        count = count + 1;
    }

    public static void locker() {
        try {
            lock.lock();
            count = count + 1;
        } finally {
            lock.unlock();
        }
    }

    public static synchronized void synchron(){
        count = count + 1;
    }
}
