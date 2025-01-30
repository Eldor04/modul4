package examExamples.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(1990, 1, 1);
        LocalDate end = LocalDate.of(2024, 1, 1);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Long> workDaysCallable = () -> {
            long workDays = 0;
            LocalDate currentDay = start;
            while (currentDay.isBefore(end)) {
                DayOfWeek dayOfWeek = currentDay.getDayOfWeek();
                if (dayOfWeek != DayOfWeek.SUNDAY && dayOfWeek != DayOfWeek.SATURDAY) {
                    workDays++;
                }
                currentDay = currentDay.plusDays(1);

            }
            Thread.sleep(2000);
            return workDays;
        };

        Callable<Integer> leapYearCallable = () -> {
            int leapYears = 0;
            for (int i = start.getYear(); i <= end.getYear(); i++) {
                if (Year.isLeap(i)) {
                    leapYears++;
                }
            }
            Thread.sleep(2000);
            return leapYears;
        };
        long begin = System.currentTimeMillis();
        Future<Long> workDaysFuture = executorService.submit(workDaysCallable);
        Future<Integer> leapYearFuture = executorService.submit(leapYearCallable);


        try {
            Long workDays = workDaysFuture.get();
            Integer leapYears = leapYearFuture.get();

            System.out.println("Work day : " + workDays + "\nLeap years: " + leapYears);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        System.out.println("Time: " + (System.currentTimeMillis() - begin));
    }
}
