package lesson5.classWork;

import java.util.concurrent.RecursiveTask;

public class MyRecTask extends RecursiveTask<Integer> {
    private int[] array;
    private int minForkSize;
    private int start;
    private int end;

    public MyRecTask(int[] array, int minForkSize, int start, int end) {
        this.array = array;
        this.minForkSize = minForkSize;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

       if (end - start > minForkSize){
           int middle = (start + end) / 2;
           MyRecTask left = new MyRecTask(array, minForkSize, start , middle);
           MyRecTask right = new MyRecTask(array, minForkSize, middle , end);
           invokeAll(left,right);
           return left.join() + right.join();

       }else {
           int counter = 0;
           for (int i = start; i < end; i++) {
               if (array[i] > 4){
                   counter++;
                   try {
                       Thread.sleep(1);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }

           }
           return counter;
       }
    }
}
