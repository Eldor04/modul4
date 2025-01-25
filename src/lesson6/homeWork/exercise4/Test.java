package lesson6.homeWork.exercise4;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

//    Joriy sanadan oldingi va keyingi YAKSHANBA kunlarining
//    sanasini yyyy.mm.dd formatda chiqarib beradigan method tuzing
//    va bu methodni main() methodida chaqirib ishlating.

    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate dateBefore = dateNow;
        LocalDate dateAfter = dateNow;

        while (dateBefore.getDayOfWeek().getValue() != 7){
            dateBefore = dateBefore.minusDays(1);
        }
        while (dateAfter.getDayOfWeek().getValue() != 7){
           dateAfter = dateAfter.plusDays(1);
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy : MM : dd");
        System.out.println("прежнее воскресеньне: " + dateBefore.format(dateTimeFormatter));
        System.out.println("следующее воскресеньне: " + dateAfter.format(dateTimeFormatter));
    }
}
