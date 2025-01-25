package lesson6.classWork;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoEra;

public class LocalDateTest {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalDate localDate1 = localDate.plusDays(15);
        System.out.println("localDate1 = " + localDate1);

        LocalDate localDate2 = localDate.minusMonths(3);
        System.out.println("localDate2 = " + localDate2);

        boolean leapYear = localDate2.isLeapYear();
        System.out.println(leapYear);

        Month month = localDate.getMonth();
        System.out.println("month = " + month);

        DayOfWeek dayOfWeek =localDate.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.THURSDAY){
            System.out.println(dayOfWeek);
        }

        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        IsoEra era = localDate.getEra();
        System.out.println("era = " + era);



    }
}
