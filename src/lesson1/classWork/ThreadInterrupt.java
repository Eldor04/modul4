package lesson1.classWork;

public class ThreadInterrupt {
    public static void main(String[] args) {

        Runnable runnable = () -> {

            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " ishladi");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        thread.interrupt();
    }
}
