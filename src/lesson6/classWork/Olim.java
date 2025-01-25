package lesson6.classWork;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;

public class Olim {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2022,1,21,0,0);
        LocalDateTime currentTime = LocalDateTime.now();
        long workHours = 0;
        while (start.isBefore(currentTime)){
            DayOfWeek dayOfWeek = start.getDayOfWeek();
            Month month = start.getMonth();
            if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY
                    || month == Month.SEPTEMBER || month == Month.OCTOBER || month == Month.DECEMBER){
                if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY){
                    workHours = workHours + 8;
                }
            }else {
                if (dayOfWeek == DayOfWeek.MONDAY || dayOfWeek == DayOfWeek.THURSDAY || dayOfWeek == DayOfWeek.WEDNESDAY ){
                    workHours = workHours + 7;
                }
            }
            start = start.plusDays(1);
        }
        System.out.println("workHours = " + workHours);
    }
}
