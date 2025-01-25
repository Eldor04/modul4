package lesson6.classWork;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Jama {
    public static void main(String[] args) {

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.of(2021, 3, 16, 0, 0);
        long workingHours = 0;
        while (start.isBefore(currentTime)) {
            DayOfWeek dayOfWeek = start.getDayOfWeek();
            if (dayOfWeek != DayOfWeek.SUNDAY && dayOfWeek != DayOfWeek.SATURDAY) {
                workingHours = workingHours + 6;
            }
            if (dayOfWeek == DayOfWeek.SUNDAY) {
                workingHours = workingHours + 8;
            }
            start = start.plusDays(1);
        }
        System.out.println("workingHours = " + workingHours);

    }
}
