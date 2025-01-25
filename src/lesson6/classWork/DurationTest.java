package lesson6.classWork;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class DurationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("soatni kiriting");
        int hour = scanner.nextInt();
        System.out.println("minutni kiriting");
        int minut = scanner.nextInt();

        LocalTime now = LocalTime.now();
        LocalTime set = LocalTime.of(hour,minut);
        Duration duration = Duration.between(now,set);
        System.out.println("duration = " + duration);
    }
}
