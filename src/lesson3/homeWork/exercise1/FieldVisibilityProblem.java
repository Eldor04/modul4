package lesson3.homeWork.exercise1;

public class FieldVisibilityProblem {
    public volatile boolean condition;

    public static void main(String[] args) throws InterruptedException {
        FieldVisibilityProblem problem = new FieldVisibilityProblem();


        Runnable runnable = () -> {
            problem.condition = true;

            while (problem.condition) {
            }
            System.out.println("Finished");
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(1500);

        problem.condition = false;


        System.out.println("Condition is: " + problem.condition);
    }
}
