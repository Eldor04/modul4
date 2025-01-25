package lesson6.homeWork.exercise8;

import java.time.LocalDateTime;
import java.time.Month;

public class Test {
//    Matn shakli (LocalDateTime formati)dagi sanadan sana va vaqtni oluvchi method tuzing.
//
//    Input:                 "2020-07-22T08:40:50.090"
//
//    Output:            2020-07-22
//            08:40:50.090

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Input: " + now);
        int year = now.getYear();
        int month = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nano = now.getNano() / 1000000;
        System.out.printf("Output: %s-%s-%s %s:%s:%s.%s",year,month,dayOfMonth,hour,minute,second,nano);
    }
}
