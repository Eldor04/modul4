package lesson6.homeWork.exercise3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Test {
//    Foydalanuvchi tug'ilgan yili, oyi va kunini kiritganida hozir necha yosh,
//    oy va kunligini hisoblab chiqaradigan dastur tuzing.
    public static void main(String[] args) {

        birthday();

    }

    private static void birthday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tug'ilgan yilizni kiriting: ");
        int myYear = scanner.nextInt();
        System.out.println("Tug'ilgan oyizni kiriting: ");
        int MyMonth = scanner.nextInt();
        System.out.println("Tug'ilgan kunizni kiriting: ");
        int MyDay = scanner.nextInt();

        LocalDate now = LocalDate.now();
        LocalDate set = LocalDate.of(myYear, MyMonth, MyDay);
        Period period = Period.between(set,now);
        int year = period.getYears();
        int month = period.getMonths();
        int days = period.getDays();
        System.out.printf("%s year %s month %s days",year,month,days);
    }
}
