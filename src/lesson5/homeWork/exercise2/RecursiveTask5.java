package lesson5.homeWork.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecursiveTask5 extends RecursiveTask<List<Integer>> {
private List<Integer> list;
private int minForkJoin;
private int start;
private int end;

    public RecursiveTask5(List<Integer> list, int minForkJoin, int start, int end) {
        this.list = list;
        this.minForkJoin = minForkJoin;
        this.start = start;
        this.end = end;
    }

    @Override
    protected List<Integer> compute() {
        if (end - start > minForkJoin){
            int midddle = (end + start) / 2;
            RecursiveTask5 left = new RecursiveTask5(list,minForkJoin,start,midddle);
            RecursiveTask5 right = new RecursiveTask5(list,minForkJoin,midddle,end);
            invokeAll(left,right);
            List<Integer> result = new ArrayList<>(left.join());
            result.addAll(right.join());
            return result;
        }else {
            List<Integer> five = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                if (i % 5 == 0){
                    five.add(i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return five;
        }
    }
}
