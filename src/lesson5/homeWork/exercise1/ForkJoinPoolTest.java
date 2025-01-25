package lesson5.homeWork.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolTest {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(40000);
        for (int i = 1; i <= 40_000; i++) {
            list.add(i);
        }

        long begin = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        RecursiveTaskTest task = new RecursiveTaskTest(list,1000,0,list.size());
        List<Integer> lists = forkJoinPool.invoke(task);
        long end = System.currentTimeMillis();
        System.out.println("Time :" + (end-begin));
        System.out.println(lists.size());

    }
}
