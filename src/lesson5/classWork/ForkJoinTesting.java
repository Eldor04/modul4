package lesson5.classWork;

import java.util.Random;
import java.util.concurrent.*;

public class ForkJoinTesting {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        ForkJoinPool forkJoinPool = new ForkJoinPool();


        Random random = new Random();
        int[] ints = new int[20_000];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        System.out.println("Array toldi");

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        long begin = System.currentTimeMillis();
        MyRecTask task = new MyRecTask(ints, 1000, 0, ints.length);
        Integer count = forkJoinPool.invoke(task);
        long end = System.currentTimeMillis();
        System.out.printf("Time forkJoin: %s , count: %s \n " , (end - begin), count);

        singleExecutor(ints);

    }

    private static void singleExecutor(int[] ints) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        long begin = System.currentTimeMillis();

        Future<Integer> submit = executorService.submit(() -> filter(ints));
        Integer count = submit.get();
        executorService.shutdown();

        long end = System.currentTimeMillis();
        System.out.printf("Time Single: %s , count: %s \n " , (end - begin), count);
    }

    private static int filter(int[] ints) {
        int count = 0;
        for (int num : ints) {
            if (num > 4) {
                count++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return count;
    }
}
