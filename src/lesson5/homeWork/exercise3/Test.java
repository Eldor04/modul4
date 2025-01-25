package lesson5.homeWork.exercise3;

public class Test {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
        }

        System.out.println("Thread.currentThread() = " + Thread.currentThread());
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
