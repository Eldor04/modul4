package lesson3.classWork;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AtomicityWithLockTest {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();

        Runnable runnable1 = () -> {
            for (int i = 0; i < 500; i++) {
                try {
                    lock.lock();
                    counter = counter + 1;
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock();
                }
            }
        };
//        Runnable runnable2 = () -> {
//            for (int i = 0; i < 500; i++) {
//                try {
//                    lock.lock();
//                    counter = counter + 1;
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }finally {
//                    lock.unlock();
//                }
//            }
//        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();


        Thread.sleep(2000);

        System.out.println(counter);
    }
}
