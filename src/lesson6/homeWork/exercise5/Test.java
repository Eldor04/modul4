package lesson6.homeWork.exercise5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {
    //    Dastur ishga tushganda joriy yilda nechta oy qolganini chiqazuvchi method tuzing
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int currentMonth = date.getMonthValue();
        int count = 12 - currentMonth;


        System.out.println(count);

    }
}
