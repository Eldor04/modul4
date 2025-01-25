package lesson5.homeWork.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkJoin5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(40000);
        for (int i = 1; i <= 40000; i++) {
            list.add(i);
        }

        long begin = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        RecursiveTask5 task = new RecursiveTask5(list,200,0, list.size());
        List<Integer> invoke = forkJoinPool.invoke(task);
        long end = System.currentTimeMillis();
        System.out.printf("Time: %s , 5ga qoldiqsiz bo'linadiganlar soni: %s " , end- begin, invoke );
    }
}
