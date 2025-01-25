package lesson5.classWork;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
    private final int[] ints;
    private final int minimumForkSize;
    private final int start;
    private final int end;

    public MyRecursiveTask(int[] ints, int minimumForkSize, int start, int end) {
        this.ints = ints;
        this.minimumForkSize = minimumForkSize;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start > minimumForkSize) {
            int muddle = (start + end) / 2;
            MyRecursiveTask left = new MyRecursiveTask(ints, minimumForkSize, start, muddle);
            MyRecursiveTask right = new MyRecursiveTask(ints, minimumForkSize, muddle, end);

            invokeAll(left, right);
            return left.join() + right.join();
        } else {
            int sum = 0;
            for (int i = start; i < end; i++) {
                if (i % 2 == 0){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    sum += i;
                }
            }
            return sum;
        }
    }
}
