package lesson6.homeWork.exercise2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test {
//    2. Foydalanuvchi bergan vaqt va hozirgi vaqtning farqini (hh:mm:ss formatda) hisoblaydigan method tuzing.

    public static void main(String[] args) {
        duration();

    }

    private static void duration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("soatni kiriting");
        int hour = scanner.nextInt();
        System.out.println("minutni kiriting");
        int minut = scanner.nextInt();

        LocalTime now = LocalTime.now();
        LocalTime set = LocalTime.of(hour,minut);
        Duration duration = Duration.between(set,now);
        System.out.println(duration);
        int hours = (int) duration.toHours();
        int minuts = (int) duration.toMinutes() % 60;
        int seconds = (int) duration.toSeconds() % 60;
        System.out.printf("%s:%s:%s",hours,minuts,seconds);
    }
}
