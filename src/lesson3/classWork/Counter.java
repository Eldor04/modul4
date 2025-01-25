package lesson3.classWork;

public class Counter {
    private int counter = 0;

    public synchronized int incrementAndGet() {
        counter = counter + 1;
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        var counter = new Counter();
        Runnable runnable = () -> {
            for ( int i = 0; i < 1000; i++ ) {
                System.out.println(Thread.currentThread() + "::" + counter.incrementAndGet());

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        for ( int i = 0; i < 10; i++ ) {
            new Thread(runnable).start();
        }
        Thread.sleep(2000);
        System.out.println(counter.counter);
    }
}
