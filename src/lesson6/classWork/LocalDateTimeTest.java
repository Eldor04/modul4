package lesson6.classWork;

import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2025,1,16,21,05,36,758696853);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("localDateTimeNow = " + localDateTimeNow);

        LocalDateTime days = localDateTimeNow.plusDays(78);
        System.out.println("days = " + days);

        LocalDateTime hours = localDateTimeNow.plusHours(3280);
        System.out.println("hours = " + hours);


    }
}
