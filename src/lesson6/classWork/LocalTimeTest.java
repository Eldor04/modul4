package lesson6.classWork;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

//        LocalTime localTime1 = localTime.plusMinutes(40);
//        System.out.println("localTime1 = " + localTime1);

        LocalTime time = LocalTime.of(13, 45);
        System.out.println("time = " + time);

        boolean after = time.isAfter(localTime);
        System.out.println("after = " + after);

        boolean before = time.isBefore(localTime);
        System.out.println("before = " + before);

    }
}
