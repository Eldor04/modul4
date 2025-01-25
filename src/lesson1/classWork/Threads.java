package lesson1.classWork;

public class Threads {
    public static void main(String[] args) throws InterruptedException {


        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);

        int activeCount = Thread.activeCount();
        System.out.println(activeCount);

        Thread[] threads = new Thread[activeCount];
        Thread.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread);
        }

//        MyThread myThread = new MyThread();
//        myThread.setName("My thread");
//        myThread.setPriority(Thread.MAX_PRIORITY);
//        myThread.start();
//        Thread.sleep(2);
//        System.out.println("main thread");

//        MyRunnable myRunnable = new MyRunnable();
//
//        Thread thread = new Thread(myRunnable);
//        thread.start();

        Runnable runnable = () -> {

            System.out.println("Hello my runnable : " + Thread.currentThread());
        };
        Thread thread = new Thread(runnable );
        thread.start();

    }
      public static class MyThread extends Thread{
          @Override
          public void run() {
              System.out.println("Hello my thread : " + Thread.currentThread().getName());
          }
      }

      public  static class MyRunnable implements Runnable{

          @Override
          public void run() {
              System.out.println("Hello my runnable : " + Thread.currentThread().getName());
          }
      }

}
