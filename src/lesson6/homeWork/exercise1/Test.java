package lesson6.homeWork.exercise1;

import javax.smartcardio.ATR;
import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

    //1. Joriy sanani vaqtsiz  va joriy vaqtni sanasiz ekranga chiqazuvchi method tuzing.

    public static void main(String[] args) {

        time();
        data();

    }

    private static void data() {
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
    }

    private static void time() {
        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);
    }
}
