package examExamples.task1;

public class Counter {
    private int count;

    public synchronized int inc(){
        count = count + 1;
        return count;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args){
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 500; i++) {
                counter.inc();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(counter.getCount());
    }
}
