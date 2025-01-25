package lesson5.homeWork.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskTest extends RecursiveTask<List<Integer>> {
    private List<Integer> list;
    private int minForkJoin;
    private int start;
    private int end;

    public RecursiveTaskTest(List<Integer> list, int minForkJoin, int start, int end) {
        this.list = list;
        this.minForkJoin = minForkJoin;
        this.start = start;
        this.end = end;
    }

    @Override
    protected List<Integer> compute() {
        if (end - start > minForkJoin) {
            int middle = (end + start) / 2;
            RecursiveTaskTest left = new RecursiveTaskTest(list,minForkJoin, start, middle);
            RecursiveTaskTest right = new RecursiveTaskTest(list,minForkJoin, middle, end);
            invokeAll(left,right);
            List<Integer> result = new ArrayList<>(left.join());
            result.addAll(right.join());
            return result;
        }else {

            List<Integer> tubSon = new ArrayList<>();

            for (int i = start; i < end; i++) {
                if(tubsonmi(i)) {
                    tubSon.add(i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return tubSon;
        }

    }

    private static boolean tubsonmi(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                count++;
            }
        }
        return count == 2;
    }

}
