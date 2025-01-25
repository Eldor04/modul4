package lesson6.classWork;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(now, ZoneId.systemDefault());
        System.out.println("zonedDateTime1 = " + zonedDateTime1);

    }
}
