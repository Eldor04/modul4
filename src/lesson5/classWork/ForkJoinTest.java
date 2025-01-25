package lesson5.classWork;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;


public class ForkJoinTest{
    public static void main(String[] args) {


        Random random = new Random();
        int[] ints = new int[40_000];
        for (int i = 0; i < ints.length; i++) {

            ints[i] = random.nextInt(10);
        }
        System.out.println("Array to'ldi");

        long begin = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(ints,1000,0,ints.length);
        Integer invoke = forkJoinPool.invoke(myRecursiveTask);
        long end = System.currentTimeMillis();
        System.out.printf("Fork join result %s : Time taken %s: ", invoke, end-begin );

    }
}
