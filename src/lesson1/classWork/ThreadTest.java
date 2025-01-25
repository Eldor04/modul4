package lesson1.classWork;
//
//public class ThreadTest {
//    public static void main(String[] args) {
//
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("Thread");
//
//
//
//        MyRunnable runnable = new MyRunnable();
//        Thread thread = new Thread(runnable, "runnable");
//        thread.start();
//        System.out.println("Runnable");
//
//    }
//    public static class  MyThread extends Thread{
//        @Override
//        public void run() {
//            System.out.println("Hello my thread: " + Thread.currentThread().getName());
//        }
//    }
//
//    public static class MyRunnable implements Runnable{
//
//        @Override
//        public void run() {
//            System.out.println("Hello my runnable: " + Thread.currentThread().getName());
//        }
//    }
//}
