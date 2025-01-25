package lesson6.classWork;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TimeIp {
    public static void main(String[] args) {
        Instant instant = Instant.now().plus(5,ChronoUnit.HOURS);
        Instant newInstance = instant.minus(5, ChronoUnit.HOURS);
        System.out.println("instant = " + instant);
        System.out.println("newInstance = " + newInstance);
        boolean before = instant.isBefore(newInstance);
        System.out.println("before = " + before);
        boolean after = instant.isAfter(newInstance);
        System.out.println("after = " + after);

        Instant instant1 = instant.plusSeconds(3600);
        System.out.println("instant1 = " + instant1);
    }
}
